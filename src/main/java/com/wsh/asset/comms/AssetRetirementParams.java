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
public class AssetRetirementParams extends Params{
    /**
     * 清理报废表
     */
    //清理报废id
    private Integer[] retirementId;
    //清理报废单号
    private String retirementNumber;
    //资产id
    private Integer retirementAssetid;
    //报废申请人
    private Integer retirementApplicantuserid;
    //白费操作人
    private Integer retirementOperator;
    //报废存放地
    private String retirementStorageplace;
    //报废时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date retirementTime;
    //报废原因
    private String retirementReason;
    //报废备注
    private String retirementRemark;
    //报废前使用人id
    private Integer retirementOlduserid;
    //报废前使用部门id
    private Integer retirementOlddepartmentid;
    //报废前使用人地点
    private String retirementOldstorageplace;
    //报废前领用时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date retirementOldenabledate;
}
