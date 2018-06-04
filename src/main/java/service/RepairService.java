package service;

import po.RepairList;

import java.util.List;
import java.util.Map;

public interface RepairService {

    /**
     * ������һ�����޼�¼
      * @param repairList
     * @return
     */
    boolean insertRepair(RepairList repairList);

    /**
     * ɾ��һ����¼
     * @param map
     * @return
     */
    boolean deleteRepair(Map<String,String> map);

    /**
     * ��ѯ��¼
     * @param m ��ѯ���������������̣�process��
     * @return
     */
    List<RepairList> selectRepair(Map<String,String> m);

    /**
     * ���¼�¼
     * @param rl
     * @return
     */
    boolean updateRepair(RepairList rl);
}
