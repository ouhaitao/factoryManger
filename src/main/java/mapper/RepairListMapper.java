package mapper;

import po.RepairList;

public interface RepairListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RepairList record);

    int insertSelective(RepairList record);

    RepairList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RepairList record);

    int updateByPrimaryKey(RepairList record);
}