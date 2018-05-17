package security;

import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import po.Admin;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Admin admin=adminMapper.selectById(id);
        if (admin==null){
            throw new UsernameNotFoundException("UserId " + id + " not found");
        }
        MyUserDetails myUserDetails=new MyUserDetails(admin);
        return myUserDetails;
    }
}
