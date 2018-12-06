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
public class AssetRepairParams extends Params{
    /*
    *维修登记表
    * */
    //维修id
    private Integer[] repairId;
    //维修单号
    private String repairNumber;
    //资产id
    private Integer repairAssetid;
    //报修申请者
    private Integer repairApplicantuserid;
    //维修开始时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date repairStarttime;
    //维修状态码
    private Integer repairResult;
    //维修结束时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date repairEndtime;
    //维修原因
    private String repairReason;
    //维修内容
    private String repairContent;
    //维修价格
    private Integer repairPrice;
    //维修状态
    private Integer repairRepairstatus;
    //维修员
    private String repairService;
    //维修前资产使用状态
    private Integer repairAssetStatus;
    //操作员
    private Integer repairOperator;
    //备注
    private String repairRemark;
    //逻辑删除
    private Integer repairStatus;

}
