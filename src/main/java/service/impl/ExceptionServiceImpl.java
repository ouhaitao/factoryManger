package service.impl;

import po.ExceptionList;
import service.ExceptionService;

import java.util.List;
import java.util.Map;

public class ExceptionServiceImpl implements ExceptionService {
    @Override
    public boolean insertException(ExceptionList e) {
        return false;
    }

    @Override
    public boolean deleteException(int id) {
        return false;
    }

    @Override
    public List<ExceptionList> selectException(Map<String, String> map) {
        return null;
    }

    @Override
    public boolean updateException(ExceptionList e) {
        return false;
    }
}
