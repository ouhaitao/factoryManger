package  mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import po.Rate;

import java.util.List;
import java.util.Map;

public interface RateMapper {
    int deleteByPrimaryKey(Rate key);

    int insert(Rate record);

    int insertSelective(Rate record);

    Rate selectByPrimaryKey(Rate key);

    @Select("select * from atb_rate where id=#{oid} and process=#{process} order by date desc limit 0,7")
    List<Rate> selectRates(Map<String,Object> map);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);

    @Select("select * from atb_rate where id=#{oid} and process=#{process} and date=#{date}")
    Rate selectRate(@Param("oid")Integer oid, @Param("process")Integer process,@Param("date")String date);
}