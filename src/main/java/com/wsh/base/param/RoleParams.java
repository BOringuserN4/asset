package com.wsh.base.param;

import com.wsh.asset.comms.Params;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:09
 */
@Setter
@Getter
@ToString
public class RoleParams extends Params {
    /*
    * 角色表
    * */
    //角色id
    private Integer[] roleId;
    //角色名
    private String roleName;
    //角色父类id
    private Integer roleParentid;
    //角色描述
    private String roleDiscribe;
    //备注
    private String roleRemark;
    private Integer start;
    private Integer length;
}
