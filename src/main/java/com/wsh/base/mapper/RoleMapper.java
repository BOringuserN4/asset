package com.wsh.base.mapper;

import com.wsh.base.param.RoleParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:15
 */
public interface RoleMapper {

     List<Map<String, Object>> listRole(RoleParams roleParams) ;

    int addRole(RoleParams roleParams);

    int updateRole(RoleParams roleParams);

    int deleteRole(RoleParams roleParams);
}
