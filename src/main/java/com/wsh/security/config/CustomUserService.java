package com.wsh.security.config;

import com.wsh.base.mapper.UserMapper;
import com.wsh.base.param.UserParams;
import com.wsh.security.bean.SecurityUserRole;
import com.wsh.security.service.SecurityRoleService;
import com.wsh.security.service.SecurityUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: yuexin
 * @Date: 2018/12/4 0004 21:41
 */

@Configuration
@EnableWebSecurity
public class CustomUserService implements UserDetailsService {

    @Resource
    private SecurityUserRoleService userRoleService;

    @Resource
    private SecurityRoleService roleService;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        UserParams user = userMapper.listUserByName(name);
        if (user==null) {
            System.out.println("--------------");
        }
        //获取用户所有的关联角色
//        UserParams userParams = new UserParams();
        List<SecurityUserRole> roleList = userRoleService.findByUserId(user.getUser_id());
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if(roleList != null && roleList.size() > 0){
            for (SecurityUserRole ur : roleList){
                String roleName = roleService.findById(ur.getRoleId()).getName();
                authorities.add(new SimpleGrantedAuthority(roleName));
            }
        }
        return new User(user.getUser_name(),user.getUser_password(),authorities);
    }
}
