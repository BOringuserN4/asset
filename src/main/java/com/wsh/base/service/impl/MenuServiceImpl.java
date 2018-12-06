package com.wsh.base.service.impl;

import com.wsh.base.mapper.MenuMapper;
import com.wsh.base.param.MenuParams;
import com.wsh.base.param.UserParams;
import com.wsh.base.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:03
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Map<String, Object>> listMenu(MenuParams menuParams) {
        List<Map<String,Object>> menuList = menuMapper.listMenu(menuParams);
        return menuList;
    }

    @Override
    public List<Map<String, Object>> listMenuId(UserParams userParams) {
        List<Map<String,Object>> menuList = menuMapper.listMenuId(userParams);
        return menuList;
    }

    @Override
    public int addMenu(MenuParams menuParams) {
        int menuCode = menuMapper.addMenu(menuParams);
        return menuCode;
    }

    @Override
    public int updateMenu(MenuParams menuParams) {
        int menuCode = menuMapper.updateMenu(menuParams);
        return menuCode;
    }

    @Override
    public int deleteMenu(MenuParams menuParams) {
        int menuCode = menuMapper.deleteMenu(menuParams);
        return menuCode;
    }
}

