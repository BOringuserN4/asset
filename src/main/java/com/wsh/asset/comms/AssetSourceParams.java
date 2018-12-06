package com.wsh.asset.comms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AssetSourceParams extends Params{
    /*
    *资产来源表
    */
    //资产来源id
    private Integer[] assetsourceId;
    //资产来源名
    private String assetsourceName;
    //资产来源描述
    private String assetsourceDiscribe;
    //备注
    private String assetsourceRemark;

}

