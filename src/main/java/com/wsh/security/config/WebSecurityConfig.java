package com.wsh.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author: yuexin
 * @Date: 2018/12/4 0004 22:00
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public CustomUserService customUserService(){
        return new CustomUserService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .formLogin()
                .failureUrl("/login?error")
                //登陆成功时跳转的页面
//                .defaultSuccessUrl("/ayUser/test")
                .permitAll();
        super.configure(http);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(customUserService());
    }
}
