package com.wsh.asset.service;

import com.wsh.asset.comms.AssetSourceParams;

import java.util.Map;


public interface AssetSourceService {

     Map<String, Object> listAsset(AssetSourceParams assetSourceParams);

     int addAsset(AssetSourceParams assetSourceParams);

     int deleteAsset(AssetSourceParams assetSourceParams);

     int updateAsset(AssetSourceParams assetSourceParams);
}
