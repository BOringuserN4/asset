package com.wsh.security.service.Impl;

import com.wsh.security.bean.SecurityUserRole;
import com.wsh.security.repository.UserRoleRepository;
import com.wsh.security.service.SecurityUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yuexin
 * @Date: 2018/12/4 0004 21:08
 */
@Service
public class SecurityUserRoleServiceImpl implements SecurityUserRoleService {

    @Resource
    private UserRoleRepository userRoleRepository;

    @Override
    public List<SecurityUserRole> findByUserId(Integer[] userId) {
        return userRoleRepository.findByUserId(userId);
    }
}
