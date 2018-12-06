package com.wsh.base.service;

import com.wsh.base.param.UserParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 15:56
 */
public interface LoginService {
     List<Map<String, Object>> listUser(UserParams userParams) ;

    int addUser(UserParams userParams);

    int updateUser(UserParams userParams);

    int deleteUser(UserParams userParams);
}
