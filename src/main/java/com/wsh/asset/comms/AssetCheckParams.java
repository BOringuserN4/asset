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
public class AssetCheckParams extends Params{
    /*
    * 资产盘点表
    * */
    //盘点id
    private Integer[] checkId;
    //盘点单号
    private String checkNumber;
    //资产id
    private Integer checkAssetid;
    //盘点状态
    private Integer checkCheckstatus;
    //盘点发布人
    private Integer checkPublishuserid;
    //盘点发布时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date checkPublishdate;
    //所有盘点完成时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date checkAllfinishdate;
    //盘点预计开始时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date checkPlanstartdate;
    //盘点全部开始时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date checkAllstartdate;
    //盘点单个完成的时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date checkSinglefinishdate;
    //盘点人
    private Integer checkCheckuserid;
    //盘点结果
    private Integer checkResult;
    //结果备注
    private String checkResultremark;
    //盘点图片
    private String checkPicture;
    //单个子任务备注
    private String checkRemark;
    //资产领用人id
    private Integer checkUserid;
    //盘点部门id
    private Integer checkDepartmentid;
    //领用地点
    private String checkStorageplace;
    //领用时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date checkEnabledate;
    //盘点状态
    private Integer checkStatus;

}
