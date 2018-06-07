package service;

import po.ExceptionList;

import java.util.List;
import java.util.Map;

public interface ExceptionService {

    /**
     * �½�һ���쳣������Ϣ
     * @param e
     * @return
     */
   boolean insertException(ExceptionList e);

    /**
     * ɾ��һ���쳣��Ϣ
     * @param id �쳣����id
     * @return
     */
   boolean deleteException(int id);

    /**
     * ��ѯ�쳣������Ϣ�б�
     * @param map ��ѯ����
     * @return
     */
   List<ExceptionList> selectException(Map<String,String> map);

    /**
     * ���±��浥��Ϣ
     * @param e
     * @return
     */
   boolean updateException(ExceptionList e);
}
