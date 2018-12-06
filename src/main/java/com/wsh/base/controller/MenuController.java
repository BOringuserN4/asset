package com.wsh.base.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.base.param.MenuParams;
import com.wsh.base.param.RoleParams;
import com.wsh.base.param.UserParams;
import com.wsh.base.service.MenuService;
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
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 查找所有菜单
     *
     * @param menuParams
     * @return
     */
    @RequestMapping(value = "listMenu",method = RequestMethod.GET)
    public CommResponse listMenu(MenuParams menuParams){
        List<Map<String,Object>> menuList = menuService.listMenu(menuParams);
        if(CollectionUtils.isEmpty(menuList)){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(menuList);
    }

    /**
     * 根据用户查找所有菜单
     *
     * @param userParams
     * @return
     */
    @RequestMapping(value = "listMenuId",method = RequestMethod.GET)
    public CommResponse listMenuId (UserParams userParams){
        List<Map<String,Object>> menuList = menuService.listMenuId(userParams);
        if(CollectionUtils.isEmpty(menuList)){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(menuList);
    }

    /**
     * 增加菜单
     *
     * @param menuParams
     * @return
     */
    @RequestMapping(value = "addMenu",method = RequestMethod.POST)
    public CommResponse addMenu(MenuParams menuParams){
        int menuCode = menuService.addMenu(menuParams);
        return CommResponse.success(menuCode);
    }

    /**
     * 修改菜单
     *
     * @param menuParams
     * @return
     */
    @RequestMapping(value = "updateMenu",method = RequestMethod.POST)
    public CommResponse updateMenu(MenuParams menuParams){
        int menuCode = menuService.updateMenu(menuParams);
        return CommResponse.success(menuCode);
    }

    /**
     * 删除菜单
     *
     * @param menuParams
     * @return
     */
    @RequestMapping(value = "deleteMenu",method = RequestMethod.POST)
    public CommResponse deleteMenu(MenuParams menuParams){
        int menuCode = menuService.deleteMenu(menuParams);
        return CommResponse.success(menuCode);
    }
}
