package com.wsh.security.service.Impl;

import com.wsh.security.bean.SecurityRole;
import com.wsh.security.repository.RoleRepository;
import com.wsh.security.service.SecurityRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author: yuexin
 * @Date: 2018/12/4 0004 20:54
 */
@Service
public class SecurityRoleServiceImpl implements SecurityRoleService {

    @Resource
    private RoleRepository roleRepository;

    @Override
    public SecurityRole findById(String id) {
        return roleRepository.findByRoleId(id);
    }
}
