package com.wsh.base.mapper;

import com.wsh.base.param.UserParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:15
 */
public interface LoginMapper {
     List<Map<String, Object>> listUser(UserParams userParams) ;

    int addUser(UserParams userParams);

    int updateUser(UserParams userParams);

    int deleteUser(UserParams userParams);
}
