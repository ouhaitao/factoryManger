package mapper;

import po.ProduceLog;

import java.util.List;

public interface ProduceLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProduceLog record);

    int insertSelective(ProduceLog record);

    ProduceLog selectByPrimaryKey(Integer id);

    List<ProduceLog> selectByOrderKey(Integer oid, Integer process);

    int updateByPrimaryKeySelective(ProduceLog record);

    int updateByPrimaryKey(ProduceLog record);
}