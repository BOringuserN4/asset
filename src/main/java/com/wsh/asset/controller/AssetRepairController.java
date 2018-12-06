package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.Util.CreateNumber;
import com.wsh.asset.comms.AssetRepairParams;
import com.wsh.asset.service.AssetRepairService;
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
@RequestMapping("/assetRepair")
public class AssetRepairController {

    @Autowired
    private AssetRepairService assetRepairService;

    /**
     * 查找所有修理中资产
     *
     * @param assetRepairParams
     * @return
     */
    @RequestMapping(value = "/listAssetRepair",method = RequestMethod.GET)
    public CommResponse listRepairasset(AssetRepairParams assetRepairParams){
    Map<String,Object> repairList = assetRepairService.listRepairasset(assetRepairParams);
        if(repairList.isEmpty()){
        return CommResponse.success(new String[]{});
    }
        return CommResponse.success(repairList);
    }

    /**
     * 增加修理资产
     *
     * @param assetRepairParams
     * @return
     */
    @RequestMapping(value = "/addAssetRepair",method = RequestMethod.POST)
    public CommResponse addRepairasset(AssetRepairParams assetRepairParams){
        //资产维修自动单号生成
        assetRepairParams.setRepairNumber(CreateNumber.createNum(5));
        int repairCode = assetRepairService.addRepairasset(assetRepairParams);
        return CommResponse.success(repairCode);
    }

    /**
     * 修改修理资产
     *
     * @param assetRepairParams
     * @return
     */
    @RequestMapping(value = "/updateAssetRepair",method = RequestMethod.POST)
    public CommResponse updateRepairAsset(AssetRepairParams assetRepairParams){
        int repairCode = assetRepairService.updateRepairAsset(assetRepairParams);
        return CommResponse.success(repairCode);
    }
    /**
     * 删除修理资产
     *
     * @param assetRepairParams
     * @return
     */
    @RequestMapping(value = "/deleteAssetRepair",method = RequestMethod.POST)
    public CommResponse deleteRepairAsset(AssetRepairParams assetRepairParams){
        int repairCode = assetRepairService.deleteRepairAsset(assetRepairParams);
        return CommResponse.success(repairCode);
    }
}
