package com.wsh.base.service.impl;

import com.wsh.base.mapper.RoleMapper;
import com.wsh.base.param.RoleParams;
import com.wsh.base.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:03
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Map<String,Object>> listRole(RoleParams roleParams) {
        List<Map<String,Object>> RoleList = roleMapper.listRole(roleParams);
        return RoleList;

    }

    @Override
    public int addRole(RoleParams roleParams) {
        int roleCode = roleMapper.addRole(roleParams);
        return roleCode;
    }

    @Override
    public int updateRole(RoleParams roleParams) {
        int roleCode = roleMapper.updateRole(roleParams);
        return roleCode;
    }

    @Override
    public int deleteRole(RoleParams roleParams) {
        int roleCode = roleMapper.deleteRole(roleParams);
        return roleCode;
    }

}

