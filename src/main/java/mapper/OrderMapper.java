package mapper;

import org.apache.ibatis.annotations.Select;
import po.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    @Select("select * from atb_order where process=#{process} order by id desc")
    List<Order> selectByProcess(Integer process);

    Order selectByState(Integer process);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

}