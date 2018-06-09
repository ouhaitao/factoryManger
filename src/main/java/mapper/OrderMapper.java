package mapper;

import org.apache.ibatis.annotations.Select;
import po.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    @Select("select * from atb_order where process=#{process}")
    List<Order> selectByProcess(Integer process);

    Order selectByState(Integer process);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    @Select("select * from atb_order where process=#{process} and state=#{state}")
    Order selectOrderByMap(Map<String,Integer> map);

    @Select("select * from atb_order where process=#{process} and state!=#{state}")
    Order selectProduceOrder(Map<String,Integer> map);
}