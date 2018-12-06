package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.comms.AssetClassifyParams;
import com.wsh.asset.service.AssetClassifyService;
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
@RequestMapping("/assetClassify")
public class AssetClassifyController {

    @Autowired
    public AssetClassifyService assetClassifyService;

    /**
    * 查找所有的分类
     *
     * @param assetClassifyParams
     * @return
    */
    @RequestMapping(value = "listAssetClassify", method = RequestMethod.GET)
    public CommResponse listClassify(AssetClassifyParams assetClassifyParams){
        Map<String,Object> classifyList = assetClassifyService.listAssetClassify(assetClassifyParams);
        if(classifyList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(classifyList);
    }

    /**
     * 增加分类
     *
     * @param assetClassifyParams
     * @return
     */
    @RequestMapping(value = "addAssetClassify", method = RequestMethod.POST)
    public CommResponse addClassify(AssetClassifyParams assetClassifyParams){
        int classifyCode = assetClassifyService.addAssetClassify(assetClassifyParams);
        return CommResponse.success(classifyCode);
    }

    /**
     * 修改分类
     *
     * @param assetClassifyParams
     * @return
     */
    @RequestMapping(value = "updateAssetClassify", method = RequestMethod.POST)
    public CommResponse updataClassify(AssetClassifyParams assetClassifyParams){
        int classifyCode = assetClassifyService.updateAssetClassify(assetClassifyParams);
        return CommResponse.success(classifyCode);
    }

    /**
     * 删除分类
     *
     * @param assetClassifyParams
     * @return
     */
    @RequestMapping(value = "deleteAssetClassify", method = RequestMethod.POST)
    public CommResponse deleteClassify(AssetClassifyParams assetClassifyParams){
        int classifyCode = assetClassifyService.deleteAssetClassify(assetClassifyParams);
        return CommResponse.success(classifyCode);
    }
}