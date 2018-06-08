package mapper;

import po.ExceptionList;

import java.util.List;

public interface ExceptionListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExceptionList record);

    int insertSelective(ExceptionList record);

    ExceptionList selectByPrimaryKey(Integer id);

    List<ExceptionList> selectBySubmit(String submit);

    int updateByPrimaryKeySelective(ExceptionList record);

    int updateByPrimaryKey(ExceptionList record);

}