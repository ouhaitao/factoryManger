package service;

import po.QualityReport;

import java.util.List;
import java.util.Map;

public interface QualityService {

    /**
     * �½�һ���ʼ챨����Ϣ
     * @param qualityReport
     * @return
     */
    boolean insertQuality(QualityReport qualityReport);

    /**
     * ɾ���ʼ챨������
     * @param map
     * @return
     */
    boolean deleteQuality(Map<String,String> map);

    /**
     * ��ѯ�ʼ챨���б�
     * ����controller���õĲ���state����ѯ��ʷ���滹�ǵ�ǰ�ʼ챨��
     * state="now" ��ǰ��state="history" ��ʷ��¼
     * @param map
     * @return
     */
    List<QualityReport> selectQuality(Map<String,String> map);

    /**
     * �����ʼ���Ϣ
     * @param qr
     * @return
     */
    boolean updateQuality(QualityReport qr);
}
