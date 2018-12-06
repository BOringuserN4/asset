package com.wsh.security.service;

import com.wsh.security.bean.SecurityRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yuexin
 * @Date: 2018/11/22 0022 20:51
 */
@Service
public interface SecurityRoleService {


    SecurityRole findById(String id);

}
