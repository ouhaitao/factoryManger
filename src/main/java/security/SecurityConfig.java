package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    MyUserDetailService userDetailService;

    /**
     * ���ڴ��д��������û�
     * @param
     * @throws Exception
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/static/**","/img/**", "/font/**", "/js/**", "/css/**","/order/**","/","/printing/**").permitAll()//���ʣ�/home �����¼��֤Ȩ��
                .anyRequest().authenticated()
                .antMatchers("/oauth/token").permitAll()
                .and()
                .formLogin()
                .loginPage("/loginPage")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/logoutSuccess") //�˳���¼���Ĭ����ַ�ǡ�/home��
                .permitAll()
                .invalidateHttpSession(true)
                .and()
                .httpBasic();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService);
//        auth.inMemoryAuthentication()
//                .withUser("user").password("password").roles("ADMIN");
    }
    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
            AuthenticationManager manager = super.authenticationManagerBean();
              return manager;
           }


}
