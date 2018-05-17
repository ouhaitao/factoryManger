package mapper;

import org.apache.ibatis.annotations.Select;
import po.Admin;

import java.util.List;
import java.util.Map;

public interface AdminMapper {

    @Select("select * from admin where username=#{username}")
    Admin selectById(String username);

    int insert(Admin admin);

    int delete(Admin admin);

    List<Admin> select(Map<String,String> map);

    int update(Admin admin);
}
