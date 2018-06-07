package service.impl;

import mapper.*;
import model.OrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Material;
import po.Order;
import po.ProduceLog;
import po.Warehouse;
import service.OrderService;
import util.OrderType;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class OrderServiceImpl implements OrderService {
    private static Logger logger= LoggerFactory.getLogger(OrderServiceImpl.class);
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


    @Override
    public boolean createOrder(Order o) {
        if (o.isError()){
            logger.error("/n订单信息异常：",o.toString()+"/n");
        }
        int result=orderMapper.insert(o);
        if (result<0){
            logger.error("/n 订单插入出错：",o.toString());
            return false;
        }
        logger.info("/n 订单插入成功：",o.toString());
        return true;
    }

    @Override
    public boolean deleteOrder(int orderId) {
        materialMapper.deleteByPrimaryKey(orderId);
        int result=orderMapper.deleteByPrimaryKey(orderId);
        if (result<0){
            logger.error("/n 订单删除出错：","orderId:"+orderId);
            return false;
        }
        logger.info("/n 订单删除成功：","orderId:"+orderId);
        return true;
    }

    @Override
    public List<Order> findOrderByProcess(int process) {
        List<Order> list=orderMapper.selectByProcess(process);
        return list;
    }

    @Override
    public OrderModel selectOrderModel(int process) {
        Order order=orderMapper.selectByState(process);
        Material material=materialMapper.selectByOrderId(order.getId(),process);
        OrderModel orderModel=new OrderModel(order,material);
        return orderModel;
    }

    @Override
    public boolean updateOrderState(Map<String, String> m) {
        Integer oderid=Integer.valueOf(m.get("oderId"));
        Integer process=Integer.valueOf(m.get("process"));
        Integer state=Integer.valueOf(m.get("state"));
        Integer uid=Integer.valueOf("uid");
        Order order=new Order();
        order.setId(oderid);
        order.setProcess(process);
        order.setState(state);
        int result=orderMapper.updateByPrimaryKeySelective(order);

        ProduceLog pl=new ProduceLog();
        pl.setProcess(process);
        pl.setoId(oderid);
        pl.setuId(uid);
        pl.setType(OrderType.RATE);
        pl.setInformation("修改状态为"+state);
        Date date=new Date();
        String nowdate=String.valueOf(date.getTime());
        pl.setDate(nowdate);
        produceLogMapper.insert(pl);

        if(result<0){
            return false;
        }
        return true;
    }

    @Override
    public boolean updateRate(Map<String, String> map) {
        Integer oderid=Integer.valueOf(map.get("oderId"));
        Integer process=Integer.valueOf(map.get("process"));
        Integer rate=Integer.valueOf(map.get("rate"));
        Integer uid=Integer.valueOf("uid");
        Order order=new Order();
        order.setId(oderid);
        order.setProcess(process);
        order.setRate(rate);
        int result=orderMapper.updateByPrimaryKeySelective(order);

        ProduceLog pl=new ProduceLog();
        pl.setProcess(process);
        pl.setoId(oderid);
        pl.setuId(uid);
        Date date=new Date();
        String nowdate=String.valueOf(date.getTime());
        pl.setDate(nowdate);
        pl.setInformation("生产进度修改为"+rate);
        pl.setType(OrderType.RATE);
        produceLogMapper.insert(pl);

        if(result<0){
            return false;
        }
        return true;
    }

    @Override
    public String updateMaterial(Map<String, String> map) {
        Integer oderid=Integer.valueOf(map.get("oderId"));
        Integer process=Integer.valueOf(map.get("process"));
        Integer mid=Integer.valueOf(map.get("mid"));
        Integer uid=Integer.valueOf("uid");
        String operate=map.get("operate");
        Integer reality=Integer.valueOf("reality");
        Integer consume=Integer.valueOf("consume");

        ProduceLog pl=new ProduceLog();
        pl.setProcess(process);
        pl.setoId(oderid);
        pl.setuId(uid);
        Date date=new Date();
        String nowdate=String.valueOf(date.getTime());
        pl.setDate(nowdate);

        Material mat=new Material();
        mat.setOid(oderid);
        mat.setProcess(process);
        mat.setMid(mid);

        if(operate.equals("add")){
            mat.setReality(reality);
            pl.setInformation("增加原料数量："+reality);
            pl.setType(OrderType.MATERIAL);

        }else if(operate.equals("remove")){
            Warehouse wh=warehouseMapper.selectByPrimaryKey(mid);
            int stock=wh.getStock();
            wh.setStock(stock+(reality-consume));
            pl.setInformation("退料数量："+(reality-consume));
            pl.setType(OrderType.MATERIAL);
        }else {
            Integer scrap=Integer.valueOf("scrap");
            mat.setScrap(0);
            pl.setInformation("处理废料数量："+scrap);
            pl.setType(OrderType.MATERIAL);
        }

        int result=materialMapper.updateByPrimaryKey(mat);

        if(result<0){
            return "Failed";
        }
        return "Succeed";
    }
}
