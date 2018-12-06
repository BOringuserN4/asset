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
public class TMenuRoleParams extends Params {
    /*
    * 角色菜单关联表
    * */
    //角色菜单关联id
    private Integer[] TrmrId;
    //角色id
    private Integer TrmrRoleId;
    //菜单id
    private Integer[] TrmrMenuId;
    //使用一个非数组的菜单
    private Integer TrmrMenu;
    private Integer start;
    private Integer length;
}
