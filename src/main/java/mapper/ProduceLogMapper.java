package mapper;

import org.apache.ibatis.annotations.Insert;
import po.ProduceLog;

import java.util.List;
import java.util.Map;

public interface ProduceLogMapper {

    @Insert(value = "INSERT INTO produceLog VALUES(#{id},#{oId},#{uId},#{date},#{type},#{information},#{result})")
    int insert(ProduceLog logs);

    int delete(ProduceLog logs);

    List<ProduceLog> select(Map<String,String > map);

    int update(ProduceLog logs);

}
