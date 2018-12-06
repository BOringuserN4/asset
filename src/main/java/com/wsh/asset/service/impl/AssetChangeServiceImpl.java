package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetChangeParams;
import com.wsh.asset.mapper.AssetChangeMapper;
import com.wsh.asset.service.AssetChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetChangeServiceImpl implements AssetChangeService {

    @Autowired
    private AssetChangeMapper assetTransferMapper;

    @Override
    public Map<String, Object> listChangeAsset(AssetChangeParams assetChangeParams) {
        List<Map<String,Object>> changeList = assetTransferMapper.listChangeAsset(assetChangeParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(changeList,assetChangeParams.getStart(),assetChangeParams.getLength());
        int count = changeList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);

        return assetMap;
    }

    @Override
    public int addChangeAsset(AssetChangeParams assetChangeParams) {
        int changeCode = assetTransferMapper.addChangeAsset(assetChangeParams);
        return changeCode;
    }

    @Override
    public int updateChangeAsset(AssetChangeParams assetChangeParams) {
        int changeCode = assetTransferMapper.updateChangeAsset(assetChangeParams);
        return changeCode;
    }

    @Override
    public int deleteChangeAsset(AssetChangeParams assetChangeParams) {
        int changeCode = assetTransferMapper.deleteChangeAsset(assetChangeParams);
        return changeCode;
    }


}
