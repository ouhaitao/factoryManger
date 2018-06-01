package service;

import po.ProduceLog;

import java.util.List;
import java.util.Map;

public interface ProduceLogService {

    /**
     * �ύ������־
     * @param produceLog
     * @return
     */
    boolean createLog(ProduceLog produceLog);

    /**
     * ɾ��������־����ʱ����ʵ��
     * @param map ɾ��������
     * @return
     */
    boolean deleteLog(Map<String,String> map);

    /**
     * ��ѯ������־
     * @param map ��ѯ��������ʱ���ж���id��key=oid����
     * @return ��ѯ�Ľ����
     */
    List<ProduceLog> select(Map<String,String> map);

    /**
     * ����������־
     * @param produceLog
     * @return
     */
    boolean update(ProduceLog produceLog);

}
