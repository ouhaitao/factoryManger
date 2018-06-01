package  mapper;

import po.Rate;

public interface RateMapper {
    int deleteByPrimaryKey(Rate key);

    int insert(Rate record);

    int insertSelective(Rate record);

    Rate selectByPrimaryKey(Rate key);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);
}