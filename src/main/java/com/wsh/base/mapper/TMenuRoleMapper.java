package com.wsh.base.mapper;

import com.wsh.base.param.TMenuRoleParams;
import com.wsh.base.param.UserParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:15
 */
public interface TMenuRoleMapper {

    List<Map<String, Object>> listtMenuRole(TMenuRoleParams tMenuRoleParams);

    int addtMenuRole(TMenuRoleParams tMenuRoleParams);

    int updatetMenuRole(TMenuRoleParams tMenuRoleParams);

    int deletetMenuRole(TMenuRoleParams tMenuRoleParams);

}
