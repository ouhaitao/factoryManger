package service;

import java.util.List;
import java.util.Map;

import po.Order;

public interface OrderService {

	public boolean createOrder(Order o);
	
	public boolean deleteOrder(int orderId);
	
	public List<Order> findOrderByCusId(int id);
	
	public List<Order> findAllOrder();
	
	public boolean changeOrder(Map<String, String> m);
}
