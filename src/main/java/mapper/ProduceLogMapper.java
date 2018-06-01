package mapper;

import po.ProduceLog;

public interface ProduceLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProduceLog record);

    int insertSelective(ProduceLog record);

    ProduceLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProduceLog record);

    int updateByPrimaryKeyWithBLOBs(ProduceLog record);

    int updateByPrimaryKey(ProduceLog record);
}