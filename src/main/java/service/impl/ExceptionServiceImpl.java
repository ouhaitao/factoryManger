package service.impl;

import mapper.ExceptionListMapper;
import mapper.ProduceLogMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.ExceptionList;
import po.ProduceLog;
import service.ExceptionService;

import java.util.List;
import java.util.Map;

@Service
public class ExceptionServiceImpl implements ExceptionService {
    private static Logger logger = LoggerFactory.getLogger(ExceptionServiceImpl.class);

    @Autowired
    ExceptionListMapper exceptionMapper;
    @Autowired
    ProduceLogMapper produceLogMapper;

    @Override
    public boolean insertException(ExceptionList e) {
        ProduceLog produceLog = new ProduceLog(e.getOid(), Integer.valueOf(e.getsubmit()).intValue(), e.getUid(), e.getDate(), e.getType(), e.getSummary(), "提交");
        produceLogMapper.insert(produceLog);
        int id = exceptionMapper.insert(e);
        if (id > 0) {
            logger.info("提交异常报告成功：" + id);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteException(int id) {
        int result = exceptionMapper.deleteByPrimaryKey(id);
        logger.info("撤销异常报告：id=" + id);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<ExceptionList> selectException(Map<String, String> map) {
        List<ExceptionList> list = exceptionMapper.selectBySubmit(map.get("submit"));
        return list;
    }

    @Override
    public boolean updateException(ExceptionList e) {
        return false;
    }
}
