package com.wsh.asset.service;

import com.wsh.asset.comms.AssetParams;
import com.wsh.asset.comms.DepartmentParams;

import java.util.Map;

public interface AssetService {

    Map<String,Object>  listAsset(AssetParams assetParams);

    Map<String, Object> listDepartmentAsset(DepartmentParams departmentParams);

    int addAsset(AssetParams assetParams);

    int updateAsset(AssetParams assetParams);

    int deleteAsset(AssetParams assetParams);
}
