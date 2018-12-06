package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.Util.CreateNumber;
import com.wsh.asset.comms.AssetRefundParams;
import com.wsh.asset.service.AssetRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: yuexin
 * @Date: 2018/9/1 10:55
 */
@RestController
@RequestMapping("/assetRefund")
public class AssetRefundController {

    @Autowired
    private AssetRefundService assetRefundService;

    /**
     * 查找所有退库资产
     *
     * @param assetRefundParams
     * @return
     */
    @RequestMapping(value = "/listAssetRefund",method = RequestMethod.GET)
    public CommResponse listRefundAsset(AssetRefundParams assetRefundParams){
        Map<String,Object> refundList = assetRefundService.listRefundAsset(assetRefundParams);
        if(refundList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(refundList);
    }

    /**
     * 增加退库资产
     *
     * @param assetRefundParams
     * @return
     */
    @RequestMapping(value = "/addAssetRefund",method = RequestMethod.POST)
    public CommResponse addRefundAsset(AssetRefundParams assetRefundParams){
        ////资产退库自动单号生成
        assetRefundParams.setRefundNumber(CreateNumber.createNum(4));
        int refundCode = assetRefundService.addRefundAsset(assetRefundParams);
        return CommResponse.success(refundCode);
    }

    /**
     * 修改退库资产
     *
     * @param assetRefundParams
     * @return
     */
    @RequestMapping(value = "/updateAssetRefund",method = RequestMethod.POST)
    public CommResponse updateRefundAsset(AssetRefundParams assetRefundParams){
        int refundCode = assetRefundService.updateRefundAsset(assetRefundParams);
        return CommResponse.success(refundCode);
    }

    /**
     *删除退库资产
     *
     * @param assetRefundParams
     * @return
     */
    @RequestMapping(value = "/deleteAssetRefund",method = RequestMethod.POST)
    public CommResponse deleteRefundAsset(AssetRefundParams assetRefundParams){
        int refundCode = assetRefundService.deleteRefundAsset(assetRefundParams);
        return CommResponse.success(refundCode);
    }
}
