package com.wsh.base.param;

import com.wsh.asset.comms.Params;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:09
 */
@Setter
@Getter
@ToString
public class UserParams extends Params {
    /*
    * 用户表
    * */
    //用户id
    private Integer[] user_id;
    //用户账号
    private String user_token;
    //用户工号
    private String user_login;
    //用户微信
    private String user_wechatid;
    //用户密码
    private String user_password;
    //用户名
    private String user_name;
    //用户性别
    private String user_sex;
    //用户的证件类型
    private int user_cardtype;
    //用户的证件号
    private String user_cardid;
    //用户的邮箱
    private String user_email;
    //用户电话
    private String user_mobile;
    //用户部门id
    private int user_departmentId;
    //用户角色id
    private int user_roleId;
    //用户的创建人
    private int user_creatuser;
    //用户创建时间
    private Time user_creattime;
    //备注
    private  String user_remark;
    private Integer start;
    private Integer length;

    public UserParams(){

    }

    private List<UserParams> children = new ArrayList<>();

    public List<UserParams> getChildren() {
        return children;
    }

    public void setChildren(List<UserParams> children) {
        this.children = children;
    }

}
