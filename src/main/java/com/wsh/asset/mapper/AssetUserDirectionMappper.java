package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetUseDirectionParams;

import java.util.List;
import java.util.Map;

public interface AssetUserDirectionMappper {

    List<Map<String, Object>> listAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);

    int addAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);

    int updateAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);

    int deleteAssetUserDirection(AssetUseDirectionParams assetUseDirectionParams);
}
