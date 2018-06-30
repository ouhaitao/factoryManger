package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import po.QualityReport;

public interface QualityReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QualityReport record);

    int insertSelective(QualityReport record);

    QualityReport selectByPrimaryKey(Integer id);

    @Select("select * from atb_qualityReport where oid =#{oid} and submit=#{submit}")
    QualityReport selectByOrderId(@Param("oid") Integer oid, @Param("submit")String  submit);

    int updateByPrimaryKeySelective(QualityReport record);

    int updateByPrimaryKeyWithBLOBs(QualityReport record);

    int updateByPrimaryKey(QualityReport record);
}