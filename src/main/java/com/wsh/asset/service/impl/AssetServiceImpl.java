package com.wsh.asset.service.impl;

import com.wsh.asset.Util.DateConverter;
import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.AssetParams;
import com.wsh.asset.comms.DepartmentParams;
import com.wsh.asset.mapper.AssetMapper;
import com.wsh.asset.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssetServiceImpl implements AssetService {
    @Autowired
    private AssetMapper assetMapper;


    @Override
    public Map<String,Object> listAsset(AssetParams assetParams) {
        List<Map<String,Object>> assetList = assetMapper.listAsset(assetParams);
        List<Map<String,Object>> list=ParamUtils.limitPage(assetList,assetParams.getStart(),assetParams.getLength());
        int count = assetList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();;
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public Map<String, Object> listDepartmentAsset(DepartmentParams departmentParams) {
        List<Map<String,Object>> departmentAssetList = assetMapper.listDepartmentAsset(departmentParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(departmentAssetList,departmentParams.getStart(),departmentParams.getLength());
        int count = departmentAssetList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }

    @Override
    public int addAsset(AssetParams assetParams) {
        int assetCode = assetMapper.addAsset(assetParams);
        return assetCode;
    }

    @Override
    public int updateAsset(AssetParams assetParams) {
        int assetCode = assetMapper.updateAsset(assetParams);
        return assetCode;
    }

    @Override
    public int deleteAsset(AssetParams assetParams) {
        int assetCode = assetMapper.deleteAsset(assetParams);
        return assetCode;
    }
}
