package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.comms.AssetSourceParams;
import com.wsh.asset.service.AssetSourceService;
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
@RequestMapping("/assetSource")
public class AssetSourceController {

    @Autowired
    public AssetSourceService assetStorageService;

    /**
     * 查找所有的资产来源信息
     *
     * @param assetSourceParams
     * @return
     */
    @RequestMapping(value = "listAsset",method = RequestMethod.GET)
    public CommResponse listSourceAsset(AssetSourceParams assetSourceParams){
        Map<String,Object> sourceList = assetStorageService.listAsset(assetSourceParams);
        if(sourceList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(sourceList);
    }

    /**
     * 添加资产来源
     *
     * @param assetSourceParams
     * @return
     */
    @RequestMapping(value = "addAsset",method = RequestMethod.POST)
    public CommResponse addSourceAsset(AssetSourceParams assetSourceParams){
        int sourceCode = assetStorageService.addAsset(assetSourceParams);
        return CommResponse.success(sourceCode);
    }

    /**
     * 修改资产来源
     *
     * @param assetSourceParams
     * @return
     */
    @RequestMapping(value = "updateAsset",method = RequestMethod.POST)
    public CommResponse updateSourceAsset(AssetSourceParams assetSourceParams){
        int sourceCode = assetStorageService.updateAsset(assetSourceParams);
        return CommResponse.success(sourceCode);
    }

    /**
     * 删除资产来源
     *
     * @param assetSourceParams
     * @return
     */
    @RequestMapping(value = "deleteAsset",method = RequestMethod.POST)
    public CommResponse deleteSourceAsset(AssetSourceParams assetSourceParams){
        int sourceCode = assetStorageService.deleteAsset(assetSourceParams);
        return CommResponse.success(sourceCode);
    }

}
