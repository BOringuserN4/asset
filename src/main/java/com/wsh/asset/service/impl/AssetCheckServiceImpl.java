package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetCheckParams;
import com.wsh.asset.mapper.AssetCheckMapper;
import com.wsh.asset.service.AssetCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetCheckServiceImpl implements AssetCheckService {

    @Autowired
    private AssetCheckMapper assetCheckMapper;

    @Override
    public Map<String, Object> listAssetCheck(AssetCheckParams assetCheckParams) {
        List<Map<String,Object>> checkList = assetCheckMapper.listCheckAsset(assetCheckParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(checkList,assetCheckParams.getStart(),assetCheckParams.getLength());
        int count = checkList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public int addAssetCheck(AssetCheckParams assetCheckParams) {
        int checkCode = assetCheckMapper.addCheckAsset(assetCheckParams);
        return checkCode;
    }

    @Override
    public int updateAssetCheck(AssetCheckParams assetCheckParams) {
        int checkCode = assetCheckMapper.updateCheckAsset(assetCheckParams);
        return checkCode;
    }

    @Override
    public int deleteCheckAsset(AssetCheckParams assetCheckParams) {
        int checkCode = assetCheckMapper.deleteCheckAsset(assetCheckParams);
        return checkCode;
    }

}
