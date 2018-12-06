package com.wsh.asset.comms;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ToString
public class AssetChangeParams extends Params{
    /*
    * 资产转移表
    * */
    //在此Integer使用了自动拆箱
    //资产转移id
    private Integer[] changeId;
    //资产转移单号
    private String changeNumber;
    //资产id
    private Integer changeAssetid;
    //现使用人id
    private Integer changeNowuserid;
    //现使用部门id
    private String changeNowdepartmentid;
    //现存放地
    private String changeNowstorageplace;
    //转移时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date changeNowenabledate;
    //转移操作人
    private Integer changeOperator;
    private String changeRemark;
    //原使用人
    private Integer changeOlduserid;
    //原使用部门
    private Integer changeOlddepartmentid;
    //原存放地
    private String changeOldstorageplace;
    //原领用时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date changeOldenabledate;
    private Integer changeStatus;
}






























//Integer和int的区别
//        1、Integer是int提供的封装类，而int是Java的基本数据类型；
//        2、Integer默认值是null，而int默认值是0；
//        3、声明为Integer的变量需要实例化，而声明为int的变量不需要实例化；
//        4、Integer是对象，用一个引用指向这个对象，而int是基本类型，直接存储数值。