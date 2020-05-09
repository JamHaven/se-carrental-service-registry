package pacApp.pacConfig;

import org.springframework.http.HttpMethod;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable()
                .authorizeRequests()
                //.anyRequest().permitAll();
                .antMatchers(HttpMethod.GET, "/eureka/**").authenticated() // eureka client
                .antMatchers(HttpMethod.POST, "/eureka/**").authenticated() // eureka client
                .antMatchers(HttpMethod.PUT, "/eureka/**").authenticated() // eureka client
                .antMatchers(HttpMethod.DELETE, "/eureka/**").authenticated() // eureka client
                .antMatchers(HttpMethod.OPTIONS, "/eureka/**").authenticated() // eureka client
                .anyRequest().authenticated().and().httpBasic(); // dashboard authorization
    }

}
