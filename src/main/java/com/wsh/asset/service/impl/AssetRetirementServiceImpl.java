package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetRetirementParams;
import com.wsh.asset.mapper.AssetRetirementMapper;
import com.wsh.asset.service.AssetRetirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetRetirementServiceImpl implements AssetRetirementService {

    @Autowired
    private AssetRetirementMapper assetRetirementMapper;

    @Override
    public Map<String, Object> listRetirementAsset(AssetRetirementParams assetRetirementParams) {
        List<Map<String,Object>> retirementList = assetRetirementMapper.listRetirementAsset(assetRetirementParams);
        if (assetRetirementParams.getStart() != 0 && assetRetirementParams.getLength() != 0){
            List<Map<String,Object>> list= ParamUtils.limitPage(retirementList);
            int count = retirementList.size();
            Map<String,Object> assetMap= new HashMap<String, Object>();
            assetMap.put("list",list);
            assetMap.put("count",count);
            return assetMap;
        }else{
            List<Map<String,Object>> list= ParamUtils.limitPage(retirementList,assetRetirementParams.getStart(),assetRetirementParams.getLength());
            int count = retirementList.size();
            Map<String,Object> assetMap= new HashMap<String, Object>();
            assetMap.put("list",list);
            assetMap.put("count",count);
            return assetMap;
        }

    }

    @Override
    public int addRetirementAsset(AssetRetirementParams assetRetirementParams) {
        int retirementCode = assetRetirementMapper.addRetirementAsset(assetRetirementParams);
        return retirementCode;
    }

    @Override
    public int updateRetirementAsset(AssetRetirementParams assetRetirementParams) {
        int retirementCode = assetRetirementMapper.updateRetirementAsset(assetRetirementParams);
        return retirementCode;
    }

    @Override
    public int deleteRetirementAsset(AssetRetirementParams assetRetirementParams) {
        int retirementCode = assetRetirementMapper.deleteRetirementAsset(assetRetirementParams);
        return retirementCode;
    }


}
