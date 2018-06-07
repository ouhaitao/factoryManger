package service.impl;

import po.Admin;
import service.AdminService;

public class AdminServiceImpl implements AdminService {
    @Override
    public Admin login(String username, String password) {
        return null;
    }

    @Override
    public boolean changePassword(String username, String oldPwd, String newPwd) {
        return false;
    }

    @Override
    public boolean dealOrders(int orderiId, int state) {
        return false;
    }

    @Override
    public int findMaterial(int id) {
        return 0;
    }

    @Override
    public boolean sendMaterial(int id, int num) {
        return false;
    }

    @Override
    public int getMaterial(int id, int num) {
        return 0;
    }

    @Override
    public int getSchedule(int role) {
        return 0;
    }

    @Override
    public boolean submitSchedule(int orderId, int schedule) {
        return false;
    }
}
