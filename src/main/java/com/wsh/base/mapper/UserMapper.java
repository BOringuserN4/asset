package com.wsh.base.mapper;

import com.wsh.asset.comms.AssetParams;
import com.wsh.base.param.UserParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:15
 */
public interface UserMapper {

    List<Map<String, Object>> listUser(UserParams userParams);

    UserParams listUserByName(String name);

    List<Map<String, Object>> listUserAsset(AssetParams assetParams);

    int addUser(UserParams userParams);

    int updateUser(UserParams userParams);

    int deleteUser(UserParams userParams);
}
