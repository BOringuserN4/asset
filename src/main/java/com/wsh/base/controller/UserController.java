package com.wsh.base.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.comms.AssetParams;
import com.wsh.base.param.UserParams;
import com.wsh.base.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 15:52
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查找所有用户
     *
     * @param userParams
     * @return
     */
    @RequestMapping(value = "listUser",method = RequestMethod.GET)
    public CommResponse listUser(UserParams userParams){
        Map<String,Object> userList = userService.listUser(userParams);
        if(userList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(userList);
    }

    /**
     * 组织结构查询
     *
     * @param assetParams
     * @return
     */
    @RequestMapping(value = "listUserAsset",method = RequestMethod.GET)
    public CommResponse listUserAsset(AssetParams assetParams){
        Map<String,Object> userListAsset = userService.listUserAsset(assetParams);
        if(userListAsset.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(userListAsset);
    }

    /**
     * 增加入库用户
     *
     * @param userParams
     * @return
     */
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public CommResponse adduser(UserParams userParams){
        int userCode = userService.addUser(userParams);
        return CommResponse.success(userCode);
    }
    /**
     * 修改用户
     *
     * @param userParams
     * @return
     */
    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public CommResponse updateuser(UserParams userParams){
        int userCode = userService.updateUser(userParams);
        return CommResponse.success(userCode);
    }
    /**
     * 删除用户
     *
     * @param userParams
     * @return
     */
    @RequestMapping(value = "deleteUser",method = RequestMethod.POST)
    public CommResponse deleteuser(UserParams userParams){
        int userCode = userService.deleteUser(userParams);
        return CommResponse.success(userCode);
    }
}
