package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import po.ProduceLog;

import java.util.List;

public interface ProduceLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProduceLog record);

    int insertSelective(ProduceLog record);

    ProduceLog selectByPrimaryKey(Integer id);

    @Select("select * from atb_produceLog where oid=#{oid} and process=#{process} and type like '${type}' order by date desc")
    List<ProduceLog> selectByOrderKey(@Param("oid") Integer oid, @Param("process") Integer process,@Param("type")String type);

    int updateByPrimaryKeySelective(ProduceLog record);

    int updateByPrimaryKey(ProduceLog record);
}