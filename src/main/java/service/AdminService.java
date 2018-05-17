package service;

import po.Admin;

public interface AdminService {

	/*
	 * ����Աͨ��
	 */
    Admin login(String username, String password);
	
	boolean changePassword(String username, String oldPwd, String newPwd);

	/*
	 * �г�������Ա
	 */
	/**
	 * ������
	 * @param orderiId ����id
	 * @param state �޸Ķ�����״̬
	 * @return �Ƿ��޸ĳɹ�
	 */
    boolean dealOrders(int orderiId, int state);
	
	/*
	 * �ֿ����Ա
	 */
	/**
	 * ����ԭ��
	 * @param id �ֿ����Աid
	 * @return
	 */
    int findMaterial(int id);
	/**
	 * 
	 * @param id �ֿ����Աid
	 * @param num �ͳ�ԭ�ϵ�����
	 * @return �Ƿ��ͳ��ɹ�
	 */
    boolean sendMaterial(int id, int num);
	
	/**
	 * 
	 * @param id �ֿ����Աid
	 * @param num ��õ�ԭ������
	 * @return
	 */
    int getMaterial(int id, int num);
	
	/*
	 * ӡˢ������Ա
	 * ���Ͳ�����Ա
	 * ģ�в�����Ա
	 * ��װ������Ա
	 * ���䲿����Ա
	 */
	/**
	 * 
	 * @param role Ȩ��
	 * @return ��һ������Ķ����Ľ���
	 */
    int getSchedule(int role);
	/**
	 * 
	 * @param orderId ����id
	 * @param schedule ����
	 * @return �Ƿ��ύ�ɹ�
	 */
    boolean submitSchedule(int orderId, int schedule);
	
}
