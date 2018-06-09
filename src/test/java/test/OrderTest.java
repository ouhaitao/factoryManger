package test;

import mapper.OrderMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.Order;

public class OrderTest {

    @Test
    public void test(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        OrderMapper orderService=applicationContext.getBean(OrderMapper.class);

        Order order=new Order(2,50000,0,-1,0);

       for (int i=0;i<100;i++){
            orderService.insert(order);
            System.out.println(order.getId());
       }
    }




}
