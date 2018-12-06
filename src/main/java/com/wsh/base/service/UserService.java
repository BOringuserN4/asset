package com.wsh.base.service;

import com.wsh.asset.comms.AssetParams;
import com.wsh.base.param.UserParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 15:56
 */
public interface UserService {

    Map<String, Object> listUser(UserParams userParams);

    Map<String, Object> listUserAsset(AssetParams assetParams);

    int addUser(UserParams userParams);

    int updateUser(UserParams userParams);

    int deleteUser(UserParams userParams);
}
