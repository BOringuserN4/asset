package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetParams;
import com.wsh.asset.comms.AssetRepairParams;
import com.wsh.asset.mapper.AssetRepairMapper;
import com.wsh.asset.service.AssetRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetRepairServiceImpl implements AssetRepairService {

    @Autowired
    private AssetRepairMapper assetRepairMapper;

    AssetParams assetParams = new AssetParams();

    @Override
    public Map<String, Object> listRepairasset(AssetRepairParams assetRepairParams) {
        List<Map<String,Object>> repairList = assetRepairMapper.listRepairAsset(assetRepairParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(repairList,assetRepairParams.getStart(),assetRepairParams.getLength());
        int count = repairList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public int addRepairasset(AssetRepairParams assetRepairParams) {
        assetRepairParams.setRepairAssetStatus(assetParams.getAssetUsestatus());
        int repairCode = assetRepairMapper.addRepairAsset(assetRepairParams);
        return repairCode;
    }

    @Override
    public int updateRepairAsset(AssetRepairParams assetRepairParams) {
        int repairCode = assetRepairMapper.updateRepairAsset(assetRepairParams);
        return repairCode;
    }

    @Override
    public int deleteRepairAsset(AssetRepairParams assetRepairParams) {
        int repairCode = assetRepairMapper.deleteRepairAsset(assetRepairParams);
        return repairCode;
    }
}
