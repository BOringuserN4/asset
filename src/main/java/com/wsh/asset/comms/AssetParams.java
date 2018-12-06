package com.wsh.asset.comms;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ToString
public class AssetParams extends Params{
    /*
    * 资产信息表
    * */
    //资产id
    private Integer[] assetId;
    //资产使用人id
    private Integer assetUserid;
    //资产分类id
    private Integer assetClassifyId;
    //资产部门id
    private Integer assetDepartmentid;
    //资产存放地
    private String  assetStorageplace;
    //领用日期
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date assetEnabledate;
    //使用方向id
    private Integer assetUsedirectionid;
    //入库日期
    private Date assetStoragedate;
    //资产来源id
    private Integer assetSourceid;
    //资产价格
    private Integer assetPrice;
    //资产渠道
    private String assetChannel;
    //采购单号
    private Integer assetPurchaseid;
    //合同单号
    private Integer assetContractid;
    //SN号
    private String assetSNnumber;
    //生产商
    private String assetManufactor;
    //出厂日期
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date assetProductiondate;
    //保修截至日期
    @DateTimeFormat(pattern = "yyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyy-MM-dd HH:mm:ss")
    private Date assetWarrantydeadline;
    //维保单价
    private Integer assetMaintenanceprice;
    //使用状况
    private Integer assetUsestatus;
    //备注
    private String  assetRemark;
    //逻辑删除
    private Integer assetStatus;

}
