package com.wsh.base.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.base.param.TMenuRoleParams;
import com.wsh.base.service.TMenuRoleService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author: yuexin
 * @Date: 2018/9/12 10:55
 */
@RestController
@RequestMapping("/menuRole")
public class TMenuRoleController {
    @Autowired
    private TMenuRoleService tMenuRoleService;

    /**
     * 查找所有关联
     *
     * @param tMenuRoleParams
     * @return
     */
    @RequestMapping(value = "/listMenuRole",method = RequestMethod.GET)
    public CommResponse listTMenuRole(TMenuRoleParams tMenuRoleParams){
        List<Map<String,Object>> menuRoleList = tMenuRoleService.listTMenuRole(tMenuRoleParams);
        if(CollectionUtils.isEmpty(menuRoleList)){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(menuRoleList);
    }

    /**
     * 增加关联
     *
     * @param tMenuRoleParams
     * @return
     */
    @RequestMapping(value = "/addMenuRole",method = RequestMethod.POST)
    public CommResponse addTMenuRole(TMenuRoleParams tMenuRoleParams){
        Integer[] menuRoleCode = tMenuRoleService.addTMenuRole(tMenuRoleParams);
        return CommResponse.success(tMenuRoleParams);
    }

    /**
     * 修改关联
     *
     * @param tMenuRoleParams
     * @return
     */
    @RequestMapping(value = "/updateMenuRole",method = RequestMethod.POST)
    public CommResponse updateTMenuRole(TMenuRoleParams tMenuRoleParams){
        Integer[] menuRoleCode = tMenuRoleService.updateTMenuRole(tMenuRoleParams);
        return CommResponse.success(menuRoleCode);
    }

    /**
     * 删除关联
     *
     * @param tMenuRoleParams
     * @return
     */
    @RequestMapping(value = "/deleteMenuRole",method = RequestMethod.POST)
    public CommResponse deleteTMenuRole(TMenuRoleParams tMenuRoleParams){
        int menuRoleCode = tMenuRoleService.deleteTMenuRole(tMenuRoleParams);
        return CommResponse.success(tMenuRoleParams);
    }

}

