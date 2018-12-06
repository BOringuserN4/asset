package com.wsh.asset.comms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AssetUseDirectionParams extends Params{
    /*
    * 使用方向表
    * */
    //使用方向id
    private Integer[] assetusedirectionId;
    //使用方向名
    private String assetusedirectionName;
    //使用方向描述
    private String assetusedirectionDiscribe;
    //备注
    private String assetusedirectionRemark;
    //逻辑删除
    private Integer assetusedirectionStatus;

}
