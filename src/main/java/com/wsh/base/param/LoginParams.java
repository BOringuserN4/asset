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
public class LoginParams extends Params {
    private Integer[] userId;
    private String userToken;
    private String userLogin;
    private String userWechatid;
    private String userPassword;
    private String userName;
    private String userSex;
    private int userCardtype;
    private String userCardid;
    private String userEmail;
    private String userMobile;
    private int userDepartmentId;
    private int userRoleId;
    private int userCreatuser;
    private Time userCreattime;
    private  String userRemark;
    private Integer start;
    private Integer length;
}
