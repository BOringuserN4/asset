package com.wsh.base.service;

import com.wsh.base.param.RoleParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 15:56
 */
public interface RoleService {
    List<Map<String, Object>> listRole(RoleParams roleParams) ;

    int addRole(RoleParams roleParams);

    int updateRole(RoleParams roleParams);

    int deleteRole(RoleParams roleParams);
}
