package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetReceiveParams;

import java.util.List;
import java.util.Map;

public interface AssetReceiveMapper {

    List<Map<String, Object>> listAssetReceive(AssetReceiveParams assetReceiveParams);

    int addAssetReceive(AssetReceiveParams assetReceiveParams);

    int updateAssetReceive(AssetReceiveParams assetReceiveParams);

    int deleteAssetReceive(AssetReceiveParams assetReceiveParams);
}
