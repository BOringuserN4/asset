package com.wsh.base.service;

import com.wsh.base.param.MenuParams;
import com.wsh.base.param.UserParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 15:56
 */
public interface MenuService {

    List<Map<String, Object>> listMenu(MenuParams userParams);

    List<Map<String,Object>> listMenuId(UserParams userParams);

    int addMenu(MenuParams menuParams);

    int updateMenu(MenuParams menuParams);

    int deleteMenu(MenuParams menuParams);
}
