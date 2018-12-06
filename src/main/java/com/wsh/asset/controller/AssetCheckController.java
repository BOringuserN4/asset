package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.Util.CreateNumber;
import com.wsh.asset.comms.AssetCheckParams;
import com.wsh.asset.service.AssetCheckService;
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
@RequestMapping("/assetCheck")
public class AssetCheckController {

    @Autowired
    private AssetCheckService assetCheckService;

    /**
     * 查找所有盘点中资产
     *
     * @param assetCheckParams
     * @return
     */
    @RequestMapping(value = "listAssetCheck", method = RequestMethod.GET)
    public CommResponse listCheckAsset(AssetCheckParams assetCheckParams){
        Map<String,Object> checkList = assetCheckService.listAssetCheck(assetCheckParams);
        if(checkList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(checkList);
    }

    /**
     * 增加盘点资产
     *
     * @param assetCheckParams
     * @return
     */
    @RequestMapping(value = "addAssetCheck", method = RequestMethod.POST)
    public CommResponse addCheckAsset(AssetCheckParams assetCheckParams){
        //资产盘点自动单号生成
        assetCheckParams.setCheckNumber(CreateNumber.createNum(7));
        int checkCode = assetCheckService.addAssetCheck(assetCheckParams);
        return CommResponse.success(checkCode);
    }

    /**
     * 修改盘点资产
     *
     * @param assetCheckParams
     * @return
     */
    @RequestMapping(value = "updateAssetCheck", method = RequestMethod.POST)
    public CommResponse updateCheckAsset(AssetCheckParams assetCheckParams){
        int checkCode = assetCheckService.updateAssetCheck(assetCheckParams);
        return CommResponse.success(checkCode);
    }

    /**
     * 删除盘点资产
     *
     * @param assetCheckParams
     * @return
     */
    @RequestMapping(value = "deleteAssetCheck", method = RequestMethod.POST)
    public CommResponse deleteCheck(AssetCheckParams assetCheckParams){
        int checkCode = assetCheckService.deleteCheckAsset(assetCheckParams);
        return CommResponse.success(checkCode);
    }
}
