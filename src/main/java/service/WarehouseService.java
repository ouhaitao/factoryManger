package service;

import java.util.Map;

import po.Warehouse;

public interface WarehouseService {

	public boolean createWarehouse(Warehouse w);
	
	public boolean deleteWarehouse(int id);
	
	public Warehouse findAllWarehoue();
	
	public boolean changeWarehouse(Map<String, String> m);
}
