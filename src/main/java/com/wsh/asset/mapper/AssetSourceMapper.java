package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetSourceParams;

import java.util.List;
import java.util.Map;

public interface AssetSourceMapper {

    List<Map<String, Object>> listAsset(AssetSourceParams assetSourceParams);

    int addAsset(AssetSourceParams assetSourceParams);

    int deleteAsset(AssetSourceParams assetSourceParams);

    int updateAsset(AssetSourceParams assetSourceParams);
}
