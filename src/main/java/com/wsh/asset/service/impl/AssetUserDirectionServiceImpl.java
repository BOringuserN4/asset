package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetUseDirectionParams;
import com.wsh.asset.mapper.AssetUserDirectionMappper;
import com.wsh.asset.service.AssetUserDirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetUserDirectionServiceImpl implements AssetUserDirectionService {

    @Autowired
    private AssetUserDirectionMappper assetUserDirectionMappper;

    @Override
    public Map<String, Object> listAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams) {
        List<Map<String,Object>> UserDirectionList = assetUserDirectionMappper.listAssetUserDirection(assetUseDirectionParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(UserDirectionList,assetUseDirectionParams.getStart(),assetUseDirectionParams.getLength());
        int count = UserDirectionList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public int addAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams) {
        int UserDirectionCode = assetUserDirectionMappper.addAssetUserDirection(assetUseDirectionParams);
        return UserDirectionCode;
    }

    @Override
    public int updateAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams) {
        int UserDirectionCode = assetUserDirectionMappper.updateAssetUserDirection(assetUseDirectionParams);
        return UserDirectionCode;
    }

    @Override
    public int deleteAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams) {
        int UserDirectionCode = assetUserDirectionMappper.deleteAssetUserDirection(assetUseDirectionParams);
        return UserDirectionCode;
    }

}
