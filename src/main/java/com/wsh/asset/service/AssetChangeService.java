package com.wsh.asset.service;

import com.wsh.asset.comms.AssetChangeParams;

import java.util.Map;

public interface AssetChangeService {

    Map<String, Object> listChangeAsset(AssetChangeParams assetChangeParams);

    int addChangeAsset(AssetChangeParams assetChangeParams);

    int updateChangeAsset(AssetChangeParams assetChangeParams);

    int deleteChangeAsset(AssetChangeParams assetChangeParams);
}
