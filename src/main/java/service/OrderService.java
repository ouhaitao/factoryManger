package service;

import java.util.List;
import java.util.Map;

import po.Order;

public interface OrderService {

	boolean createOrder(Order o);
	
	boolean deleteOrder(int orderId);
	
	List<Order> findOrderByState(int state);
	
	List<Order> findAllOrder();
	
	boolean changeOrder(Map<String, String> m);
}
