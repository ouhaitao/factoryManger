package service;

import po.RepairList;

import java.util.List;
import java.util.Map;

public interface RepairService {

    /**
     * 新增加一条报修记录
      * @param repairList
     * @return
     */
    boolean insertRepair(RepairList repairList);

    /**
     * 删除一条记录
     * @param map
     * @return
     */
    boolean deleteRepair(Map<String,String> map);

    /**
     * 查询记录
     * @param m 查询条件，如生产流程（process）
     * @return
     */
    List<RepairList> selectRepair(Map<String,String> m);

    /**
     * 更新记录
     * @param rl
     * @return
     */
    boolean updateRepair(RepairList rl);
}
