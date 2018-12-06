package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetRetirementParams;

import java.util.List;
import java.util.Map;

public interface AssetRetirementMapper {

    List<Map<String, Object>> listRetirementAsset(AssetRetirementParams assetRetirementParams);

    int addRetirementAsset(AssetRetirementParams assetRetirementParams);

    int updateRetirementAsset(AssetRetirementParams assetRetirementParams);

    int deleteRetirementAsset(AssetRetirementParams assetRetirementParams);
}
