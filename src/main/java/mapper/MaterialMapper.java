package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import po.Material;

public interface MaterialMapper {
    int deleteByPrimaryKey(int key);

    int insert(Material record);

    int insertSelective(Material record);

    Material selectByPrimaryKey(Material key);

    @Select("select * from atb_material where oid=#{oid} and process=#{process}")
    Material selectByOrderId(@Param("oid") Integer oderId,@Param("process") Integer process);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}