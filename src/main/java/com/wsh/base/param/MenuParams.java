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
public class MenuParams extends Params {
    /*
    * 菜单表
    * */
    //菜单id
    private Integer[] menuId;
    //菜单名
    private String menuName;
    //菜单父类id
    private Integer menuParentId;
    //菜单图标
    private String menuIcon;
    //菜单地址
    private String menuUrl;
    //菜单排序
    private Integer menuSort;
    //备注
    private String menuRemark;
    private Integer start;
    private Integer length;
}
