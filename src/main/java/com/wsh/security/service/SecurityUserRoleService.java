package com.wsh.security.service;

import com.wsh.security.bean.SecurityUserRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yuexin
 * @Date: 2018/11/22 0022 21:14
 */
@Service
public interface SecurityUserRoleService{

    List<SecurityUserRole> findByUserId(Integer[] userId);

}
