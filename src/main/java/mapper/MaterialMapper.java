package mapper;

import po.Material;

public interface MaterialMapper {
    int deleteByPrimaryKey(int key);

    int insert(Material record);

    int insertSelective(Material record);

    Material selectByPrimaryKey(Material key);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}