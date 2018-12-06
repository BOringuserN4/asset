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
public class SummaryParams extends Params{
    /*
    * 资产信息表
    * */
    private Integer[] assetId;

    private Integer assetUserid;

    private Integer assetClassifyId;

    private Integer assetDepartmentid;

    private String  assetStorageplace;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date assetEnabledate;

    private Integer assetUsedirectionid;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date assetStoragedate;

    private Integer assetSourceid;

    private Integer assetPrice;

    private String assetChannel;

    private Integer assetPurchaseid;

    private Integer assetContractid;

    private String assetSNnumber;

    private String assetManufactor;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date assetProductiondate;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date assetWarrantydeadline;

    private Integer assetMaintenanceprice;

    private Integer assetUsestatus;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date limitStartTime;

    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date limitEndTime;

    private Integer assetStatus;

    private String  assetRemark;

    private Integer assetReserve;


}
