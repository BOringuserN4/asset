package com.wsh.asset.comms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class AssetClassifyParams extends Params{
    /*
    * 资产分类表
    * */
    //资产分类id
    private Integer[] assetClassifyId;
    //资产分类名
    private String  assetClassifyName;
    //分类父类id
    private Integer assetClassifyParentid ;
    //资产分类描述
    private String  assetClassifyDiscribe;
    //备注
    private String  assetClassifyRemark;

}
