package com.wsh.asset.service;

import com.wsh.asset.comms.AssetRetirementParams;

import java.util.Map;


public interface AssetRetirementService {

    Map<String, Object> listRetirementAsset(AssetRetirementParams assetRetirementParams);

    int addRetirementAsset(AssetRetirementParams assetRetirementParams);

    int updateRetirementAsset(AssetRetirementParams assetRetirementParams);

    int deleteRetirementAsset(AssetRetirementParams assetRetirementParams);
}
