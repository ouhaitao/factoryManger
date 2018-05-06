package service;

import java.util.Map;

import po.Customer;
import po.Order;

public interface CustomerService {

	public Customer login(String username,String password);
	
	public Customer register(String username,String password);
	
	public Order findOrder(String username);
	
	public boolean changePassword(String password);
	
	public boolean createAddress(Map<String, String> m);
	
	public boolean findAllAddress(String username);
	
	public boolean changeAddress(Map<String, String> m);
}
