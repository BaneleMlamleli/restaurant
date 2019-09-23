package com.restaurant.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder cutter)
        throws Exception{
        cutter.inMemoryAuthentication()
                .withUser("Banele")
                .password(encoder().encode("test01"))
                .roles("Manager")
                .and()
                .withUser("Chef")
                .password("Chef01")
                .roles("Head-Chef");
    }

    @Override
    protected void configure(HttpSecurity http)
        throws Exception{
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST,"restaurant/verifyUse/Warning/**/create/**").hasRole("Manager")
                .anyRequest()
                .authenticated().and()
                .httpBasic()
                .and()
                .csrf()
                .disable()
                .formLogin()
                .disable();

    }
    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
}
