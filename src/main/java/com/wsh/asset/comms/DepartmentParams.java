package com.wsh.asset.comms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DepartmentParams extends Params{
    /*
    * 部门表
    * */
    //部门ID
    private Integer departmentId;
    //部门名
    private String departmentName;
    //部门父类id
    private Integer departmentParentid;
    //部门描述
    private String departmentDiscribe;
    //备注
    private String departmentRemark;
}
