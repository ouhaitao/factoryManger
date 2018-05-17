package service;

import java.util.Map;

import po.Warehouse;

public interface WarehouseService {

	boolean createWarehouse(Warehouse w);
	
	boolean deleteWarehouse(int id);
	
	Warehouse findAllWarehoue();
	
	boolean changeWarehouse(Map<String, String> m);
}
