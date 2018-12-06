package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetCheckParams;

import java.util.List;
import java.util.Map;

public interface AssetCheckMapper {

    List<Map<String, Object>> listCheckAsset(AssetCheckParams assetCheckParams);

    int addCheckAsset(AssetCheckParams assetCheckParams);

    int updateCheckAsset(AssetCheckParams assetCheckParams);

    int deleteCheckAsset(AssetCheckParams assetCheckParams);
}
