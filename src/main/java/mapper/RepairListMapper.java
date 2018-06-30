package mapper;

import po.RepairList;

import java.util.List;

public interface RepairListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RepairList record);

    int insertSelective(RepairList record);

    RepairList selectByPrimaryKey(Integer id);

    List<RepairList> selectBySubmit(String submit);

    int updateByPrimaryKeySelective(RepairList record);

    int updateByPrimaryKey(RepairList record);
}