package service;

import po.Admin;

public interface AdminService {

	/*
	 * ����Աͨ��
	 */
	public Admin login(String username,String password);
	
	public boolean changePassword(String username,String oldPwd,String newPwd);

	/*
	 * �г�������Ա
	 */
	/**
	 * ������
	 * @param orderiId ����id
	 * @param state �޸Ķ�����״̬
	 * @return �Ƿ��޸ĳɹ�
	 */
	public boolean dealOrders(int orderiId,int state);
	
	/*
	 * �ֿ����Ա
	 */
	/**
	 * ����ԭ��
	 * @param id �ֿ����Աid
	 * @return
	 */
	public int findMaterial(int id);
	/**
	 * 
	 * @param id �ֿ����Աid
	 * @param num �ͳ�ԭ�ϵ�����
	 * @return �Ƿ��ͳ��ɹ�
	 */
	public boolean sendMaterial(int id,int num);
	
	/**
	 * 
	 * @param id �ֿ����Աid
	 * @param num ��õ�ԭ������
	 * @return
	 */
	public int getMaterial(int id,int num);
	
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
	public int getSchedule(int role);
	/**
	 * 
	 * @param orderId ����id
	 * @param schedule ����
	 * @return �Ƿ��ύ�ɹ�
	 */
	public boolean submitSchedule(int orderId,int schedule);
	
}
