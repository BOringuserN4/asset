package com.wsh.base.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetParams;
import com.wsh.base.mapper.UserMapper;
import com.wsh.base.param.UserParams;
import com.wsh.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:03
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> listUser(UserParams userParams) {
        List<Map<String,Object>> UserList = userMapper.listUser(userParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(UserList,userParams.getStart(),userParams.getLength());
        int count = UserList.size();
        Map<String,Object> userMap= new HashMap<String, Object>();
        userMap.put("list",list);
        userMap.put("count",count);
        return userMap;
    }

    @Override
    public Map<String,Object> listUserAsset(AssetParams assetParams) {
        List<Map<String,Object>> UserListAsset = userMapper.listUserAsset(assetParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(UserListAsset,assetParams.getStart(),assetParams.getLength());
        int count = UserListAsset.size();
        Map<String,Object> userMap= new HashMap<String, Object>();
        userMap.put("list",list);
        userMap.put("count",count);
        return userMap;
    }

    @Override
    public int addUser(UserParams userParams) {
        int userCode = userMapper.addUser(userParams);
        return userCode;
    }

    @Override
    public int updateUser(UserParams userParams) {
        int userCode = userMapper.updateUser(userParams);
        return userCode;
    }

    @Override
    public int deleteUser(UserParams userParams) {
        int userCode = userMapper.deleteUser(userParams);
        return userCode;
    }

}

