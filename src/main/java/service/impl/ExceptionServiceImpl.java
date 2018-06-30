package service.impl;

import mapper.ExceptionListMapper;
import mapper.ProduceLogMapper;
import mapper.RepairListMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.ExceptionList;
import po.ProduceLog;
import po.RepairList;
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
    @Autowired
    RepairListMapper repairListMapper;

    @Override
    public String insertException(ExceptionList e) {
        ProduceLog produceLog = new ProduceLog(e.getOid(), Integer.valueOf(e.getsubmit()).intValue(), e.getUid(), e.getDate(), e.getType(), e.getSummary(), "�ύ");
        produceLogMapper.insert(produceLog);
        int id = exceptionMapper.insert(e);
        if (id > 0) {
            return "TRUE";
        }
        return "FALSE";
    }

    @Override
    public String deleteException(int id) {
        int result = exceptionMapper.deleteByPrimaryKey(id);
        if (result > 0) {
            return "TRUE";
        }
        return "FALSE";
    }

    @Override
    public List<ExceptionList> selectException(Map<String, String> map) {
        List<ExceptionList> list = exceptionMapper.selectBySubmit(map.get("submit"));
        return list;
    }


    @Override
    public String insertRepair(RepairList repairList) {
        String r=repairListMapper.insert(repairList)>0?"TRUE":"FAILED";
        return r;
    }

    @Override
    public String deleteRepair(int id) {
        int result = repairListMapper.deleteByPrimaryKey(id);
        if (result > 0) {
            return "TRUE";
        }
        return "FALSE";
    }
    @Override
    public List<RepairList> selectRepair(Map<String, String> m) {
        return repairListMapper.selectBySubmit(m.get("submit"));
    }

}
