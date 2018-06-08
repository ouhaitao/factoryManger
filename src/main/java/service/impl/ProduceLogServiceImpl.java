package service.impl;

import mapper.ProduceLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import po.ProduceLog;
import service.ProduceLogService;

import java.util.List;
import java.util.Map;

public class ProduceLogServiceImpl implements ProduceLogService{
    @Autowired
    ProduceLogMapper produceLogMapper;

    @Override
    public boolean insertLog(ProduceLog produceLog) {
        int result=produceLogMapper.insert(produceLog);
        if(result<0){
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteLog(Map<String, String> map) {
        Integer lid=Integer.valueOf(map.get("lid"));
        int result=produceLogMapper.deleteByPrimaryKey(lid);
        if(result<0){
            return false;
        }
        return true;
    }

    @Override
    public List<ProduceLog> selectLog(Map<String, String> map) {
        Integer oid=Integer.valueOf(map.get("oId"));
        Integer process=Integer.valueOf(map.get("process"));
        List<ProduceLog> logList=produceLogMapper.selectByOrderKey(oid,process);
        return logList;
    }

    @Override
    public boolean update(ProduceLog produceLog) {
        int result=produceLogMapper.updateByPrimaryKey(produceLog);
        if(result<0){
            return false;
        }
        return true;
    }
}
