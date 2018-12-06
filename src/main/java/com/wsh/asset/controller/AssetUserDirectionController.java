package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.comms.AssetUseDirectionParams;
import com.wsh.asset.service.AssetUserDirectionService;
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
@RequestMapping("/assetUseDirection")
public class AssetUserDirectionController {
    @Autowired
    private AssetUserDirectionService assetUserDirectionService;

    /**
     * 查找所有资产防线
     *
     * @param assetUseDirectionParams
     * @return
     */
    @RequestMapping(value = "listAssetUseDirection",method = RequestMethod.GET)
    public CommResponse listAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams){
        Map<String,Object> AssetUserDirectionList = assetUserDirectionService.listAssetUserDirection(assetUseDirectionParams);
        if(AssetUserDirectionList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(AssetUserDirectionList);
    }

    /**
     * 增加资产来源
     *
     * @param assetUseDirectionParams
     * @return
     */
    @RequestMapping(value = "addAssetUseDirection", method = RequestMethod.POST)
    public CommResponse addAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams){
        int AssetUserDirectionList = assetUserDirectionService.addAssetUserDirection(assetUseDirectionParams);
        return CommResponse.success(AssetUserDirectionList);
    }

    /**
     * 删除资产来源
     *
     * @param assetUseDirectionParams
     * @return
     */
    @RequestMapping(value = "updateAssetUseDirection",method = RequestMethod.POST)
    public CommResponse updateAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams){
        int AssetUserDirectionList = assetUserDirectionService.updateAssetUserDirection(assetUseDirectionParams);
        return CommResponse.success(AssetUserDirectionList);
    }

    /**
     * 更新资产来源
     *
     * @param assetUseDirectionParams
     * @return
     */
    @RequestMapping(value = "deleteAssetUseDirection",method = RequestMethod.POST)
    public CommResponse deleteAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams){
        int AssetUserDirectionList = assetUserDirectionService.deleteAssetUserDirection(assetUseDirectionParams);
        return CommResponse.success(AssetUserDirectionList);
    }

}
