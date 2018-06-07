package service;

import po.Admin;

public interface AdminService {

	/*
	 * 管理员通用
	 */
    Admin login(String username, String password);
	
	boolean changePassword(String username, String oldPwd, String newPwd);

	/*
	 * 市场部管理员
	 */
	/**
	 * 处理订单
	 * @param orderiId 订单id
	 * @param state 修改订单的状态
	 * @return 是否修改成功
	 */
    boolean dealOrders(int orderiId, int state);
	
	/*
	 * 仓库管理员
	 */
	/**
	 * 查找原料
	 * @param id 仓库管理员id
	 * @return
	 */
    int findMaterial(int id);
	/**
	 * 
	 * @param id 仓库管理员id
	 * @param num 送出原料的数量
	 * @return 是否送出成功
	 */
    boolean sendMaterial(int id, int num);
	
	/**
	 * 
	 * @param id 仓库管理员id
	 * @param num 获得的原料数量
	 * @return
	 */
    int getMaterial(int id, int num);
	
	/*
	 * 印刷部管理员
	 * 成型部管理员
	 * 模切部管理员
	 * 包装部管理员
	 * 运输部管理员
	 */
	/**
	 * 
	 * @param role 权限
	 * @return 上一道工序的订单的进度
	 */
    int getSchedule(int role);
	/**
	 * 
	 * @param orderId 订单id
	 * @param schedule 进度
	 * @return 是否提交成功
	 */
    boolean submitSchedule(int orderId, int schedule);
	
}
