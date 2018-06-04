package service;

import po.Warehouse;

import java.util.List;

public interface WarehouseService {

	/**
	 * 新建一个仓库
	 * @param w
	 * @return
	 */
	boolean createWarehouse(Warehouse w);

	/**
	 * 删除一个仓库
	 * @param id
	 * @return
	 */
	boolean deleteWarehouse(int id);

	/**
	 * 查询所有的仓库
	 * @return
	 */
	List<Warehouse> findAllWarehoue();

	/**
	 * 更新仓库信息
	 * @param wh
	 * @return
	 */
	boolean changeWarehouse(Warehouse wh);
}
