package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.Util.CreateNumber;
import com.wsh.asset.comms.AssetChangeParams;
import com.wsh.asset.service.AssetChangeService;
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
@RequestMapping("/assetChange")
public class AssetChangeController {

    @Autowired
    private AssetChangeService assetChangeService;

    /**
     * 查找所有转移资产
     *
     * @param assetChangeParams
     * @return
     */
    @RequestMapping(value = "listAssetChange", method = RequestMethod.GET)
    public CommResponse listChangeAsset(AssetChangeParams assetChangeParams){
        Map<String,Object> changeList = assetChangeService.listChangeAsset(assetChangeParams);
        if(changeList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(changeList);
    }

    /**
     * 增加资产转移信息
     *
     * @param assetChangeParams
     * @return
     */
    @RequestMapping(value = "addAssetChange", method = RequestMethod.POST)
    public CommResponse addChangeAsset(AssetChangeParams assetChangeParams){
        //资产转移自动单号生成
        assetChangeParams.setChangeNumber(CreateNumber.createNum(3));
        int changeCode = assetChangeService.addChangeAsset(assetChangeParams);
        return CommResponse.success(changeCode);
    }

    /**
     * 修改资产转移信息
     *
     * @param assetChangeParams
     * @return
     */
    @RequestMapping(value = "updateAssetChange", method = RequestMethod.POST)
    public CommResponse updateChangeAsset(AssetChangeParams assetChangeParams){
        int changeCode = assetChangeService.updateChangeAsset(assetChangeParams);
        return CommResponse.success(changeCode);
    }

    /**
     * 删除资产转移信息
     *
     * @param assetTranslateParams
     * @return
     */
    @RequestMapping(value = "deleteAssetChange", method = RequestMethod.POST)
    public CommResponse deleteChangeAsset(AssetChangeParams assetTranslateParams){
        int changeCode = assetChangeService.deleteChangeAsset(assetTranslateParams);
        return CommResponse.success(changeCode);
    }

}
