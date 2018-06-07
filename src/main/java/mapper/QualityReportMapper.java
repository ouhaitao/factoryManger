package mapper;

import po.QualityReport;

public interface QualityReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QualityReport record);

    int insertSelective(QualityReport record);

    QualityReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QualityReport record);

    int updateByPrimaryKeyWithBLOBs(QualityReport record);

    int updateByPrimaryKey(QualityReport record);
}