package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.endpoint.AuthorizationEndpoint;
import org.springframework.security.oauth2.provider.token.TokenStore;

import javax.sql.DataSource;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    private static String REALM="MY_OAUTH_REALM";
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private AuthorizationEndpoint authorizationEndpoint;
    @Autowired
    private TokenStore tokenStore;

    @Autowired
    private DataSource dataSource;
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//clients.jdbc(dataSource).clients(customClientDetailsService());
        clients.inMemory()
                .withClient("my-trusted-client")//�ͻ���ID
                .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
                .scopes("read", "write", "trust")//��Ȩ�û��Ĳ���Ȩ��
                .secret("secret")//����
                .accessTokenValiditySeconds(6000);//token��Ч��Ϊ120��
    }



    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        endpoints
                .tokenStore(tokenStore)
                .authenticationManager(authenticationManager)
                // ���� GET��POST �����ȡ token�������ʶ˵㣺oauth/token
                .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {
        //�������֤
        oauthServer.allowFormAuthenticationForClients();
    }

//    @Bean
//    public ClientDetailsService customClientDetailsService(){
//        return new JdbcClientDetailsService(dataSource);
//    }
}
