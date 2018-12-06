package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetRepairParams;

import java.util.List;
import java.util.Map;

public interface AssetRepairMapper {

    List<Map<String, Object>> listRepairAsset(AssetRepairParams assetRepairParams);

    int addRepairAsset(AssetRepairParams assetRepairParams);

    int updateRepairAsset(AssetRepairParams assetRepairParams);

    int deleteRepairAsset(AssetRepairParams assetRepairParams);
}
