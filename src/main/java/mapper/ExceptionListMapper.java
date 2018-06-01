package mapper;

import po.ExceptionList;

public interface ExceptionListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExceptionList record);

    int insertSelective(ExceptionList record);

    ExceptionList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExceptionList record);

    int updateByPrimaryKey(ExceptionList record);

}