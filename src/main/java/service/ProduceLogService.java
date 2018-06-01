package service;

import po.ProduceLog;

import java.util.List;
import java.util.Map;

public interface ProduceLogService {

    /**
     * 提交生产日志
     * @param produceLog
     * @return
     */
    boolean insertLog(ProduceLog produceLog);

    /**
     * 删除生产日志，暂时不用实现
     * @param map 删除的条件
     * @return
     */
    boolean deleteLog(Map<String,String> map);

    /**
     * 查询生产日志
     * @param map 查询条件（暂时仅有订单id（key=oid））
     * @return 查询的结果集
     */
    List<ProduceLog> selectLog(Map<String,String> map);

    /**
     * 更新生产日志
     * @param produceLog
     * @return
     */
    boolean update(ProduceLog produceLog);

}
