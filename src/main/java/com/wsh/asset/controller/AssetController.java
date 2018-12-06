package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.Util.CreateNumber;
import com.wsh.asset.comms.AssetParams;
import com.wsh.asset.comms.DepartmentParams;
import com.wsh.asset.mapper.DepartmentMapper;
import com.wsh.asset.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author: yuexin
 * @Date: 2018/9/1 10:55
 */
@RestController
@RequestMapping("/asset")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 查找所有资产
     *
     * @param assetParams
     * @return
     */
    @RequestMapping(value = "listAsset", method = RequestMethod.GET)
    public CommResponse listasset(AssetParams assetParams){
        Map<String,Object> assetMap = assetService.listAsset(assetParams);
        if(assetMap.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(assetMap);
    }

    /**
     *组织架构查询
     *
     * @param departmentParams
     * @return
     */
    @RequestMapping(value = "listDepartmentAsset",method = RequestMethod.POST)
    public CommResponse listDepartmentAsset(DepartmentParams departmentParams){
        int i,j=0,k=0;
        int[] exisParent = new int[100];
        int[] parent = new int[100];
        Integer[] finalId = new Integer[100];
        List<Map<String,Object>> depMap = departmentMapper.listDepartmentParentId();
        /**
         * 将获取的数据分别放入两个整型数组
         */
        for(i=0,j=0; i<depMap.size(); i++){
            if(depMap.get(i).size()>1) {
                Map<String,Object> depWithParent = depMap.get(i);
                //使用迭代器获取map中的value值
                Iterator<String> iter = depWithParent.keySet().iterator();
                String key = iter.next();
                exisParent[j] = (int)depWithParent.get(key);
                //因为只select了两个数据，并未利用循环遍历
                String nextkey = iter.next();
                parent[j] = (int)depWithParent.get(nextkey);
                j++;
            }
        }
        Map<String,Object> departmentListAsset = assetService.listDepartmentAsset(departmentParams);
        if(departmentListAsset.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(departmentListAsset);
    }

    /**
     * 增加入库资产
     *
     * @param assetParams
     * @return
     */
    @RequestMapping(value = "addAsset",method = RequestMethod.POST)
    public CommResponse addasset(AssetParams assetParams){
        //资产入库自动单号生成
        assetParams.setAssetNumber(CreateNumber.createNum(1));
        int assetCode = assetService.addAsset(assetParams);
        return CommResponse.success(assetCode);
    }
    /**
     * 修改入库资产
     *
     * @param assetParams
     * @return
     */
    @RequestMapping(value = "updateAsset",method = RequestMethod.POST)
    public CommResponse updateasset(AssetParams assetParams){
        int assetCode = assetService.updateAsset(assetParams);
        return CommResponse.success(assetCode);
    }
    /**
     * 删除入库资产
     *
     * @param assetParams
     * @return
     */
    @RequestMapping(value = "deleteAsset",method = RequestMethod.POST)
    public CommResponse deleteasset(AssetParams assetParams){
        int assetCode = assetService.deleteAsset(assetParams);
        return CommResponse.success(assetCode);
    }
}
