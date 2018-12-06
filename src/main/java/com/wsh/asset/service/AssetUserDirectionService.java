package com.wsh.asset.service;

import com.wsh.asset.comms.AssetUseDirectionParams;

import java.util.Map;

public interface AssetUserDirectionService {

    Map<String, Object> listAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);

    int addAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);

    int updateAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);

    int deleteAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);
}
