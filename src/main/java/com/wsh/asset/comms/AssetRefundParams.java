package com.wsh.asset.comms;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@ToString
public class AssetRefundParams extends Params{
    /*
    *资产退库表
    */
    //退库id
    private Integer[] refundId;
    //退库单号
    private String refundNumber;
    //退库资产id
    private Integer refundAssetid;
    //退库储藏地
    private String refundStorageplace;
    //退库日期
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date refundDate;
    //是操作人id
    private Integer refundOperator;
    //退库备注
    private String refundRemark;
    //退库前使用人id
    private Integer refundOlduserid;
    //退库前使用人部门id
    private Integer refundOlddepartmentid;
    //退库前部门id
    private String refundOldstorageplace;
    //退库前领用日期
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date refundOldenabledate;
}
