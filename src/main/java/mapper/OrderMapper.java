package mapper;

import po.Order;

import java.util.List;
import java.util.Map;

public interface OrderMapper {

    int insert(Order order);

    int delete(Map<String ,String> map);

    List<Order> select(Map<String,String> map);

    int update(Order order);
}
