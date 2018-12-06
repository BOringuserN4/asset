package com.wsh.asset.comms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Params {
    /*
    * 公共参数表
    * */
    private String assetName;
    private String assetNumber;
    private Integer assetClassifyid;
    private String userName;
    //资产品牌
    private String assetBrand;
    private String departmentName;
    //分页所需参数
    private Integer start;
    private Integer length;
}