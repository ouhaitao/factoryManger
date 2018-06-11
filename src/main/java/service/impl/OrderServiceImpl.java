package service.impl;

import mapper.*;
import model.OrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import po.*;
import service.OrderService;
import util.LogType;
import util.OrderProcess;
import util.OrderState;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    private static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    MaterialMapper materialMapper;
    @Autowired
    QualityReportMapper qualityReportMapper;
    @Autowired
    ProduceLogMapper produceLogMapper;
    @Autowired
    WarehouseMapper warehouseMapper;
    @Autowired
    RateMapper rateMapper;


    @Override
    public boolean createOrder(Order o) {
        if (o.isError()) {
            logger.error("/n订单信息异常：", o.toString() + "/n");
        }
        int result = orderMapper.insert(o);
        if (result < 0) {
            logger.error("/n 订单插入出错：", o.toString());
            return false;
        }
        logger.info("/n 订单插入成功：", o.toString());

        return true;
    }

    @Override
    public boolean deleteOrder(int orderId) {
        materialMapper.deleteByPrimaryKey(orderId);
        int result = orderMapper.deleteByPrimaryKey(orderId);
        if (result < 0) {
            logger.error("/n 订单删除出错：", "orderId:" + orderId);
            return false;
        }
        logger.info("/n 订单删除成功：", "orderId:" + orderId);
        return true;
    }

    @Override
    public List<Order> findOrderByProcess(int process) {
        List<Order> list = orderMapper.selectByProcess(process);
        return list;
    }

    @Override
    public OrderModel selectOrderModel(int process) {
        Map<String, Integer> map = new HashMap<>();
        map.put("process", process);
        map.put("state", OrderState.NOTSTART);
        Order order = orderMapper.selectProduceOrder(map);
        Material material = materialMapper.selectByOrderId(order.getId(), process);
        OrderModel orderModel = new OrderModel(order, material);
        return orderModel;
    }

    @Override
    public boolean updateOrderState(Map<String, String> m) {
        Integer orderid = Integer.valueOf(m.get("orderId"));
        Integer process = Integer.valueOf(m.get("process"));
        Integer state = Integer.valueOf(m.get("state"));
        Integer uid = Integer.valueOf(m.get("uid"));
        Order order = new Order();
        order.setId(orderid);
        order.setProcess(process);
        order.setState(state);
        int result = orderMapper.updateByPrimaryKeySelective(order);

        ProduceLog pl = new ProduceLog();
        pl.setProcess(process);
        pl.setoId(orderid);
        pl.setuId(uid);
        pl.setType(LogType.RATE);
        pl.setInformation("执行的操作为：" + OrderState.getState(state));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String nowdate = simpleDateFormat.format(date);
        pl.setDate(nowdate);
        produceLogMapper.insert(pl);

        if (result < 0) {
            return false;
        }
        return true;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public String produceOrder(Map<String, String> m) {
        int orderId = Integer.valueOf(m.get("orderId"));
        int process = Integer.valueOf(m.get("process"));

        //判断是否有已在生产的订单
        Map<String, Integer> map = new HashMap<>();
        map.put("process", process);
        map.put("state", OrderState.NOTSTART);
        Order order = orderMapper.selectProduceOrder(map);
        if (order != null) {
            return "已有正在生产的订单";
        }

        //判断仓库原料是否充足
        order = orderMapper.selectByPrimaryKey(orderId);
        int mid = order.getProcess();//获取原料id(原料id与流程id与仓库id对应)
        int produceNum = order.getProductNum();//获取生产数量
        Warehouse warehouse;
        warehouse = warehouseMapper.selectByPrimaryKey(mid);
        if (warehouse.getStock() < produceNum) {
            warehouse.setStock(warehouse.getStock() + produceNum);
            warehouseMapper.updateByPrimaryKey(warehouse);
            return "库存原料不足，已通知仓库补货";
        }

        //修改订单状态
        Integer state = Integer.valueOf(m.get("state"));
        Integer uid = Integer.valueOf(m.get("uid"));
        order = new Order();
        order.setId(orderId);
        order.setProcess(process);
        order.setState(state);
        orderMapper.updateByPrimaryKeySelective(order);

        //记录日志
        ProduceLog pl = new ProduceLog();
        pl.setProcess(process);
        pl.setoId(orderId);
        pl.setuId(uid);
        pl.setType(LogType.RATE);
        pl.setInformation("执行的操作为：" + OrderState.getState(state));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String nowdate = simpleDateFormat.format(date);
        pl.setDate(nowdate);
        produceLogMapper.insert(pl);

        //记录原料信息以及修改仓库库存
        Material material = new Material(orderId, process, mid, produceNum, 0, 0, 0);
        warehouse.setStock(warehouse.getStock() - produceNum);
        warehouseMapper.updateByPrimaryKey(warehouse);
        int result = materialMapper.insertSelective(material);
        if (result > 0) {
            return "T";
        }
        return "F";
    }

    @Override
    public String qualityOrder(Map<String, String> m) {
        int id = Integer.valueOf(m.get("orderId"));
        Order order = orderMapper.selectByPrimaryKey(id);
        int state = order.getState();
        if (state == OrderState.QUALITY) {
            return "订单已经在质检中";
        }
        if (order.getRate() < order.getProductNum()) {
            return "订单还未完成生产计划";
        }
        if (state != OrderState.PRODUCE) {
            return "订单当前状态不能质检";
        }
        Boolean bl = updateOrderState(m);
        return bl.toString();
    }

    @Override
    public String storeOrder(Map<String, String> m) {
        int id = Integer.valueOf(m.get("orderId"));
        int process = Integer.valueOf(m.get("process"));
        String submit = OrderProcess.getProcess(process);
        QualityReport qualityReport = qualityReportMapper.selectByOrderId(id, submit);
        if (qualityReport == null || qualityReport.getResult() != 1) {
            return "只有质检合格的订单才能入库";
        }
        Boolean b = updateOrderState(m);
        return b.toString();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public String updateRate(Map<String, String> map) {
        Integer orderid = Integer.valueOf(map.get("orderId"));
        Integer process = Integer.valueOf(map.get("process"));
        Integer rate = Integer.valueOf(map.get("num"));
        Integer uid = Integer.valueOf(map.get("uid"));
        String nowdate = map.get("date");

        Rate rateObject=rateMapper.selectRate(orderid,process,nowdate);
        if (rateObject!=null){
            return "今天已经提交过进度了";
        }

        //更新order表中的进度
        Order order = orderMapper.selectByPrimaryKey(orderid);
        order.setRate(order.getRate() + rate);
        orderMapper.updateByPrimaryKeySelective(order);

        //记录日志
        ProduceLog pl = new ProduceLog();
        pl.setProcess(process);
        pl.setoId(orderid);
        pl.setuId(uid);
        pl.setDate(nowdate);
        pl.setInformation("生产进度更新：" + rate);
        pl.setType(LogType.RATE);
        produceLogMapper.insert(pl);

        //记录rate
        rateObject=new Rate(orderid,process,nowdate,rate);
        int result=rateMapper.insert(rateObject);

        if (result < 0) {
            return "F";
        }
        return "T";
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public String updateMaterial(Map<String, String> map) {
        Integer orderid = Integer.valueOf(map.get("orderId"));
        Integer process = Integer.valueOf(map.get("process"));
        Integer mid = Integer.valueOf(map.get("mid"));
        Integer uid = Integer.valueOf("uid");
        String operate = map.get("operate");
        Integer reality = Integer.valueOf("reality");
        Integer consume = Integer.valueOf("consume");

        ProduceLog pl = new ProduceLog();
        pl.setProcess(process);
        pl.setoId(orderid);
        pl.setuId(uid);
        Date date = new Date();
        String nowdate = String.valueOf(date.getTime());
        pl.setDate(nowdate);

        Material mat = new Material();
        mat.setOid(orderid);
        mat.setProcess(process);
        mat.setMid(mid);

        if (operate.equals("add")) {
            mat.setReality(reality);
            pl.setInformation("增加原料数量：" + reality);
            pl.setType(LogType.MATERIAL);

        } else if (operate.equals("remove")) {
            Warehouse wh = warehouseMapper.selectByPrimaryKey(mid);
            int stock = wh.getStock();
            wh.setStock(stock + (reality - consume));
            pl.setInformation("退料数量：" + (reality - consume));
            pl.setType(LogType.MATERIAL);
        } else {
            Integer scrap = Integer.valueOf("scrap");
            mat.setScrap(0);
            pl.setInformation("处理废料数量：" + scrap);
            pl.setType(LogType.MATERIAL);
        }

        int result = materialMapper.updateByPrimaryKey(mat);

        if (result < 0) {
            return "Failed";
        }
        return "Succeed";
    }

    @Override
    public List<Rate> selectRates(Map<String, Object> map) {
        List<Rate> list=rateMapper.selectRates(map);
        return list;
    }
}
