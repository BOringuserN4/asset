package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetChangeParams;

import java.util.List;
import java.util.Map;

public interface AssetChangeMapper {

    List<Map<String, Object>> listChangeAsset(AssetChangeParams assetChangeParams);

    int addChangeAsset(AssetChangeParams assetChangeParams);

    int updateChangeAsset(AssetChangeParams assetChangeParams);

    int deleteChangeAsset(AssetChangeParams assetChangeParams);
}
