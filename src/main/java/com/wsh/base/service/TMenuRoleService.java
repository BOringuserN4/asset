package com.wsh.base.service;

import com.wsh.base.param.TMenuRoleParams;
import com.wsh.base.param.UserParams;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 15:56
 */
public interface TMenuRoleService {

     List<Map<String, Object>> listTMenuRole(TMenuRoleParams tMenuRoleParams);

    Integer[] addTMenuRole(TMenuRoleParams tMenuRoleParams);

    Integer[] updateTMenuRole(TMenuRoleParams tMenuRoleParams);

    int deleteTMenuRole(TMenuRoleParams tMenuRoleParams);
}

