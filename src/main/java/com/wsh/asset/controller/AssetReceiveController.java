package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.Util.CreateNumber;
import com.wsh.asset.comms.AssetReceiveParams;
import com.wsh.asset.service.AssetReceiveService;
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
@RequestMapping("/assetReceive")
public class AssetReceiveController {

    @Autowired
    private AssetReceiveService assetReceiveService;

    /**
    * 查找领用资产信息
    *
     * @param assetReceiveParams
     * @return
    */
    @RequestMapping(value = "listAssetReceive",method = RequestMethod.GET)
    public CommResponse listAsset(AssetReceiveParams assetReceiveParams){
        Map<String,Object> receiveList = assetReceiveService.listAssetReceive(assetReceiveParams);
        if(receiveList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(receiveList);
    }

    /**
     * 添加领用信息
     *
     * @param assetReceiveParams
     * @return
     */
    @RequestMapping(value = "addAssetReceive",method = RequestMethod.POST)
    public CommResponse addAssetReceive(AssetReceiveParams assetReceiveParams){
        ////资产领用自动单号生成
        assetReceiveParams.setReceiveNumber(CreateNumber.createNum(2));
        int receiveCode = assetReceiveService.addAssetReceive(assetReceiveParams);
        return CommResponse.success(receiveCode);
    }

    /**
     * 修改领用信息
     *
     * @param assetReceiveParams
     * @return
     */
    @RequestMapping(value = "updateAssetReceive",method = RequestMethod.POST)
    public CommResponse updateAssetReceive(AssetReceiveParams assetReceiveParams){
        int receiveCode = assetReceiveService.updateAssetReceive(assetReceiveParams);
        return CommResponse.success(receiveCode);
    }
    /**
     * 删除领用信息
     *
     * @param assetReceiveParams
     * @return
     */
    @RequestMapping(value = "deleteAssetReceive",method = RequestMethod.POST)
    public CommResponse deleteAssetReceive(AssetReceiveParams assetReceiveParams){
        int receiveCode = assetReceiveService.deleteAssetReceive(assetReceiveParams);
        return CommResponse.success(receiveCode);
    }

}
