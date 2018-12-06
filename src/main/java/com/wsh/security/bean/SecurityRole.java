package com.wsh.security.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: yuexin
 * @Date: 2018/11/22 0022 20:36
 */

@Getter
@Setter
@Entity
@Table(name = "security_role")
public class SecurityRole {

    @Id
    private String id;

    private String name;

}
