package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetSourceParams;
import com.wsh.asset.mapper.AssetSourceMapper;
import com.wsh.asset.service.AssetSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetSourceServiceImpl implements AssetSourceService {

    @Autowired
    private AssetSourceMapper assetSourceMapper;


    @Override
    public Map<String, Object> listAsset(AssetSourceParams assetSourceParams) {
        List<Map<String,Object>> sourceList = assetSourceMapper.listAsset(assetSourceParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(sourceList,assetSourceParams.getStart(),assetSourceParams.getLength());
        int count = sourceList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public int addAsset(AssetSourceParams assetSourceParams) {
        int sourceCode = assetSourceMapper.addAsset(assetSourceParams);

        return sourceCode;
    }

    @Override
    public int deleteAsset(AssetSourceParams assetSourceParams) {
        int sourceCode = assetSourceMapper.deleteAsset(assetSourceParams);
        return sourceCode;
    }

    @Override
    public int updateAsset(AssetSourceParams assetSourceParams) {
        int sourceCode = assetSourceMapper.updateAsset(assetSourceParams);

        return sourceCode;
    }

}
