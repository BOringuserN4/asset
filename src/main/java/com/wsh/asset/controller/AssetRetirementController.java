package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.Util.CreateNumber;
import com.wsh.asset.comms.AssetRetirementParams;
import com.wsh.asset.service.AssetRetirementService;
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
@RequestMapping("/assetRetirement")
public class AssetRetirementController {

    @Autowired
    private AssetRetirementService assetRetirementService;

    /**
     * 查找所有报废资产
     *
     * @param assetRetirementParams
     * @return
     */
    @RequestMapping(value = "/listAssetRetirement",method = RequestMethod.GET)
    public CommResponse getRetirementAsset(AssetRetirementParams assetRetirementParams){
        Map<String,Object> retirementList = assetRetirementService.listRetirementAsset(assetRetirementParams);
        if(retirementList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(retirementList);
    }

    /**
     * 添加报废资产
     *
     * @param assetRetirementParams
     * @return
     */
    @RequestMapping(value = "/addAssetRetirement",method = RequestMethod.POST)
    public CommResponse addRetirementAsset(AssetRetirementParams assetRetirementParams){
        //资产报废自动单号生成
        assetRetirementParams.setRetirementNumber(CreateNumber.createNum(6));
        int retirementCode = assetRetirementService.addRetirementAsset(assetRetirementParams);
        return CommResponse.success(retirementCode);
    }

    /**
     * 修改报废资产
     *
     * @param assetRetirementParams
     * @return
     */
    @RequestMapping(value = "/updateAssetRetirement",method = RequestMethod.POST)
    public CommResponse updateRetirementAsset(AssetRetirementParams assetRetirementParams){
        int retirementCode = assetRetirementService.updateRetirementAsset(assetRetirementParams);
        return CommResponse.success(retirementCode);
    }

    /**
     * 删除报废资产
     *
     * @param assetRetirementParams
     * @return
     */
    @RequestMapping(value = "/deleteAssetRetirement",method = RequestMethod.POST)
    public CommResponse deleteRetirementAsset(AssetRetirementParams assetRetirementParams){
        int retirementCode = assetRetirementService.deleteRetirementAsset(assetRetirementParams);
        return CommResponse.success(retirementCode);
    }
}
