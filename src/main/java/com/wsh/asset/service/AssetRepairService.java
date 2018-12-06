package com.wsh.asset.service;

import com.wsh.asset.comms.AssetRepairParams;

import java.util.Map;


public interface AssetRepairService {

    Map<String, Object> listRepairasset(AssetRepairParams assetRepairParams);

    int addRepairasset(AssetRepairParams assetRepairParams);

    int updateRepairAsset(AssetRepairParams assetRepairParams);

    int deleteRepairAsset(AssetRepairParams assetRepairParams);
}

