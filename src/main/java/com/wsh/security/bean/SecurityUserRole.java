package com.wsh.security.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: yuexin
 * @Date: 2018/12/4 0004 20:41
 */

@Getter
@Setter
@Entity
@Table(name = "security_role_user")
public class SecurityUserRole {

    @Id
    private String userId;

    private String roleId;
}
