package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetParams;
import com.wsh.asset.comms.DepartmentParams;

import java.util.List;
import java.util.Map;

public interface AssetMapper {

    List<Map<String, Object>> listAsset(AssetParams assetParams);

    List<Map<String, Object>> listDepartmentAsset(DepartmentParams departmentParams);

    int addAsset(AssetParams assetParams);

    int updateAsset(AssetParams assetParams);

    int deleteAsset(AssetParams assetParams);
}
