package service;

import po.Warehouse;

import java.util.Map;

public interface WarehouseService {

	boolean createWarehouse(Warehouse w);
	
	boolean deleteWarehouse(int id);
	
	Warehouse findAllWarehoue();
	
	boolean changeWarehouse(Map<String, String> m);
}
