package service.impl;

import mapper.MaterialMapper;
import mapper.OrderMapper;
import mapper.ProduceLogMapper;
import mapper.QualityReportMapper;
import model.OrderModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Order;
import service.OrderService;

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
        return null;
    }

    @Override
    public boolean updateOrderState(Map<String, String> m) {
        return false;
    }

    @Override
    public boolean updateRate(Map<String, String> map) {
        return false;
    }

    @Override
    public String updateMaterial(Map<String, String> map) {
        return null;
    }
}
