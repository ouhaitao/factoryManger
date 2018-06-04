package service;

import model.OrderModel;
import po.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {

	/**
	 * ����һ���µĶ�������������Ϊ�ȴ�ӡˢ��process=0��state=-1��
	 * ��������ʱ������Ӧ��ԭ�ϱ����ݣ�Material��
	 * @param o
	 * @return
	 */
	boolean createOrder(Order o);

	/**
	 * ɾ��һ������
	 * @param orderId
	 * @return
	 */
	boolean deleteOrder(int orderId);

	/**
	 * ��ȡ��ǰ�����µ����ж���
	 * @param process ���̺�
	 * @return
	 */
	List<Order> findOrderByProcess(int process);

	/**
	 * �������̺�process��state��=-1���������������еĶ�����Ϣ����ѯ�����������Ϣ
	 * @param process ���̺�
	 * @return
	 */
	OrderModel selectOrderModel(int process);

	/**
	 * �޸Ķ���״̬
	 * ������������������󽫶������̽��ȣ�process����һ,������������һ������
	 * ����ο�controller
	 * @param m
	 * @return
	 */
	boolean updateOrderState (Map<String, String> m);

	/**
	 * ������������
	 * @param map �ο�controller
	 * @return
	 */
	boolean updateRate(Map <String,String> map);

	/**
	 * ���¶�����ԭ����Ϣ�������controller
	 * @param map
	 * @return
	 */
	String updateMaterial(Map<String,String> map);

}
