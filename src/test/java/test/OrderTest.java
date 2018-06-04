package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.Order;
import service.OrderService;

public class OrderTest {
    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:applicationContext.xml","classpath:springConfig.xml");

    OrderService os=applicationContext.getBean(OrderService.class);

    Order order=new Order();
}
