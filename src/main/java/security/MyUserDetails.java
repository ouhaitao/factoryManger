package security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import po.Admin;

import java.util.ArrayList;
import java.util.Collection;

public class MyUserDetails implements UserDetails {
    private static final long serialVersionUID = 1L;
    private Admin admin;

    public  MyUserDetails(Admin admin){
        this.admin=admin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        String role=admin.getRole();
        String []roles=role.split("/");
        if(roles != null)
        {
            for (String r : roles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(r);
                authorities.add(authority);
            }
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return admin.getPassword();
    }

    @Override
    public String getUsername() {
        return admin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
