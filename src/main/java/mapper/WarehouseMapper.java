package mapper;

import po.Warehouse;

import java.util.List;
import java.util.Map;

public interface WarehouseMapper {

    int insert(Warehouse warehouse);

    int delete(Map<String,String> map);

    List<Warehouse> select(Map<String,String> map);

    int update(Warehouse warehouse);
}
