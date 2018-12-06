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
public class AssetReceiveParams extends Params{
    /*
    *出库领用表表
    * */
    //领用id
    private Integer[] receiveId;
    //领用单号
    private String receiveNumber;
    //领用人id
    private Integer receiveUserid;
    //领用人姓名
    private String receiveUsername;
    //领用资产id
    private Integer receiveAssetid;
    //领用人部门id
    private Integer receiveDepartmentid;
    //领用后存放地
    private String receiveStorageplace;
    //领用时间
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date receiveEnabledate;
    //领用操作人
    private Integer receiveOperator;
    //备注
    private String receiveRemark;
}
