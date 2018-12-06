package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetRefundParams;

import com.wsh.asset.mapper.AssetRefundMapper;
import com.wsh.asset.service.AssetRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetRefundAssetImpl implements AssetRefundService {

    @Autowired
    private AssetRefundMapper assetRefundMapper;

    @Override
    public Map<String, Object> listRefundAsset(AssetRefundParams assetRefundParams) {
        List<Map<String,Object>> refundList = assetRefundMapper.listRefundAsset(assetRefundParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(refundList,assetRefundParams.getStart(),assetRefundParams.getLength());
        int count = refundList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public int addRefundAsset(AssetRefundParams assetRefundParams) {
        int refundCode = assetRefundMapper.addRefundAsset(assetRefundParams);
        return refundCode;
    }

    @Override
    public int updateRefundAsset(AssetRefundParams assetRefundParams) {
        int refundCode = assetRefundMapper.updateRefundAsset(assetRefundParams);
        return refundCode;
    }

    @Override
    public int deleteRefundAsset(AssetRefundParams assetRefundParams) {
        int refundCode = assetRefundMapper.deleteRefundAsset(assetRefundParams);
        return refundCode;
    }
}
