package com.wsh.base.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.base.param.RoleParams;
import com.wsh.base.service.RoleService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 15:53
 */

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查找所有权限
     *
     * @param roleParams
     * @return
     */
    @RequestMapping(value = "listRole",method = RequestMethod.GET)
    public CommResponse listRole(RoleParams roleParams){
        List<Map<String,Object>> roleList = roleService.listRole(roleParams);
        if(CollectionUtils.isEmpty(roleList)){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(roleList);
    }

    /**
     * 新增权限
     *
     * @param roleParams
     * @return
     */
    @RequestMapping(value = "addRole",method = RequestMethod.POST)
    public CommResponse addrole(RoleParams roleParams){
        int roleCode = roleService.addRole(roleParams);
        return CommResponse.success(roleCode);
    }
    /**
     * 修改权限
     *
     * @param roleParams
     * @return
     */
    @RequestMapping(value = "updateRole",method = RequestMethod.POST)
    public CommResponse updaterole(RoleParams roleParams){
        int roleCode = roleService.updateRole(roleParams);
        return CommResponse.success(roleCode);
    }
    /**
     * 删除权限
     *
     * @param roleParams
     * @return
     */
    @RequestMapping(value = "deleteRole",method = RequestMethod.POST)
    public CommResponse deleterole(RoleParams roleParams){
        int roleCode = roleService.deleteRole(roleParams);
        return CommResponse.success(roleCode);
    }
}
