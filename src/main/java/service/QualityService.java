package service;

import po.QualityReport;

import java.util.List;
import java.util.Map;

public interface QualityService {

    /**
     * 新建一条质检报告信息
     * @param qualityReport
     * @return
     */
    boolean insertQuality(QualityReport qualityReport);

    /**
     * 删除质检报告数据
     * @param map
     * @return
     */
    boolean deleteQuality(Map<String,String> map);

    /**
     * 查询质检报告列表
     * @param map
     * @return
     */
    List<QualityReport> selectQuality(Map<String,String> map);

    /**
     * 更新质检信息
     * @param qr
     * @return
     */
    boolean updateQuality(QualityReport qr);
}
