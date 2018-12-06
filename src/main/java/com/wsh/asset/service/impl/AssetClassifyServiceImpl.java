package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetClassifyParams;
import com.wsh.asset.mapper.AssetClassifyMapper;
import com.wsh.asset.service.AssetClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetClassifyServiceImpl implements AssetClassifyService {

    @Autowired
    private AssetClassifyMapper assetClassifyMapper;

    @Override
    public Map<String,Object> listAssetClassify(AssetClassifyParams assetClassifyParams) {
        List<Map<String,Object>> classifyList = assetClassifyMapper.listAssetClassify(assetClassifyParams);
        //待完善，需要将start与length设为非必须添加
        List<Map<String,Object>> list= ParamUtils.limitPage(classifyList,assetClassifyParams.getStart(),assetClassifyParams.getLength());
        int count = classifyList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public  int addAssetClassify(AssetClassifyParams assetClassifyParams) {
        int classifyCode = assetClassifyMapper.addAssetClassify(assetClassifyParams);
        return classifyCode;
    }

    @Override
    public  int updateAssetClassify(AssetClassifyParams assetClassifyParams) {
        int classifyCode = assetClassifyMapper.updateAssetClassify(assetClassifyParams);
        return classifyCode;
    }

    @Override
    public  int deleteAssetClassify(AssetClassifyParams assetClassifyParams) {
        int classifyCode = assetClassifyMapper.deleteAssetClassify(assetClassifyParams);
        return classifyCode;
    }
}
