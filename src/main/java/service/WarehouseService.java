package service;

import po.Warehouse;

import java.util.List;

public interface WarehouseService {

	/**
	 * �½�һ���ֿ�
	 * @param w
	 * @return
	 */
	boolean createWarehouse(Warehouse w);

	/**
	 * ɾ��һ���ֿ�
	 * @param id
	 * @return
	 */
	boolean deleteWarehouse(int id);

	/**
	 * ��ѯ���еĲֿ�
	 * @return
	 */
	List<Warehouse> findAllWarehoue();

	/**
	 * ���²ֿ���Ϣ
	 * @param wh
	 * @return
	 */
	boolean changeWarehouse(Warehouse wh);
}
