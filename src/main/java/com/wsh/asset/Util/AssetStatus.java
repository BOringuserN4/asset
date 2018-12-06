package com.wsh.asset.Util;

/**
 * @author: yuexin
 * @Date: 2018/9/19 0019 21:11
*/
//用枚举类型来定义相关功能的状态码
public enum AssetStatus {
    Asset(1)//入库
    ,
    AssetChange(3)//转移
    ,
    AssetCheck(7)//盘点
    ,
    AssetReceive(2)//领用
    ,
    AssetRefund(4)//退库
    ,
    AssetRepair(5)//维修
    ,
    AssetRetirement(6)//报废
    ;

    Integer code;

    AssetStatus(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
