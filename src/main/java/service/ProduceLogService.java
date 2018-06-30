package service;

import po.ProduceLog;

import java.util.List;
import java.util.Map;

public interface ProduceLogService {


    boolean insertLog(ProduceLog produceLog);


    boolean deleteLog(Map<String,String> map);


    List<ProduceLog> selectLog(Map<String,String> map);


    boolean update(ProduceLog produceLog);


}
