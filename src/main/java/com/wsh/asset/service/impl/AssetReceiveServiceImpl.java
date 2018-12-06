package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetReceiveParams;
import com.wsh.asset.mapper.AssetReceiveMapper;
import com.wsh.asset.service.AssetReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetReceiveServiceImpl implements AssetReceiveService {

    @Autowired
    private AssetReceiveMapper assetReceiveMapper;

    @Override
    public Map<String, Object> listAssetReceive(AssetReceiveParams assetReceiveParams) {
        List<Map<String,Object>> receiveList = assetReceiveMapper.listAssetReceive(assetReceiveParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(receiveList,assetReceiveParams.getStart(),assetReceiveParams.getLength());
        int count = receiveList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public int addAssetReceive(AssetReceiveParams assetReceiveParams) {
        int receiveCode = assetReceiveMapper.addAssetReceive(assetReceiveParams);
        return receiveCode;
    }

    @Override
    public int updateAssetReceive(AssetReceiveParams assetReceiveParams) {
        int receiveCode = assetReceiveMapper.updateAssetReceive(assetReceiveParams);
        return receiveCode;
    }

    @Override
    public int deleteAssetReceive(AssetReceiveParams assetReceiveParams) {
        int receiveCode = assetReceiveMapper.deleteAssetReceive(assetReceiveParams);
        return receiveCode;
    }
}
