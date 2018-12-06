package com.wsh.base.service.impl;

import com.wsh.base.mapper.UserMapper;
import com.wsh.base.param.UserParams;
import com.wsh.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:03
 */

//@Service
//public class LoginServiceImpl implements UserService {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Override
//    public Map<String, Object> listUser(UserParams userParams) {
//        List<Map<String,Object>> UserList = userMapper.listUser(userParams);
//        return UserList;
//    }
//
//    @Override
//    public int addUser(UserParams userParams) {
//        int userCode = userMapper.addUser(userParams);
//        return userCode;
//    }
//
//    @Override
//    public int updateUser(UserParams userParams) {
//        int userCode = userMapper.updateUser(userParams);
//        return userCode;
//    }
//
//    @Override
//    public int deleteUser(UserParams userParams) {
//        int userCode = userMapper.deleteUser(userParams);
//        return userCode;
//    }
//
//}

