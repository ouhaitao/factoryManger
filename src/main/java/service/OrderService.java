package service;

import model.OrderModel;
import po.Order;
import po.Rate;

import java.util.List;
import java.util.Map;

public interface OrderService {

	/**
	 * 创建一个新的订单，订单进度为等待印刷（process=0，state=-1）
	 * 创建订单时生成相应的原料表数据（Material）
	 * @param o
	 * @return
	 */
	boolean createOrder(Order o);

	/**
	 * 删除一个订单
	 * @param orderId
	 * @return
	 */
	boolean deleteOrder(int orderId);

	/**
	 * 获取当前流程下的所有订单
	 * @param process 流程号
	 * @return
	 */
	List<Order> findOrderByProcess(int process);

	/**
	 * 根据流程号process和state！=-1（即在生产流程中的订单信息）查询订单的相关信息
	 * @param process 流程号
	 * @return
	 */
	OrderModel selectOrderModel(int process);

	/**
	 * 修改订单状态
	 * 当订单满足入库条件后将订单流程进度（process）加一,即订单进入下一个流程
	 * 详情参考controller
	 * @param m
	 * @return
	 */
	boolean updateOrderState (Map<String, String> m);

	String produceOrder(Map<String,String> m);

	String qualityOrder(Map<String,String> m);

	String storeOrder(Map<String,String> m);

	/**
	 * 更新生产进度
	 * @param map 参考controller
	 * @return
	 */
	String updateRate(Map <String,String> map);

	/**
	 * 更新订单的原料信息，详情见controller
	 * @param map
	 * @return
	 */
	String updateMaterial(Map<String,String> map);

	List<Rate> selectRates(Map<String,Object> map);

}
