package com.wsh.asset.service;

import com.wsh.asset.comms.AssetCheckParams;

import java.util.Map;


public interface AssetCheckService {

    Map<String, Object> listAssetCheck(AssetCheckParams assetCheckParams);

    int addAssetCheck(AssetCheckParams assetCheckParams);

    int updateAssetCheck(AssetCheckParams assetCheckParams);

    int deleteCheckAsset(AssetCheckParams assetCheckParams);
}
