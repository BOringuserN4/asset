package com.wsh.asset.service;

import com.wsh.asset.comms.AssetReceiveParams;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface AssetReceiveService {

     Map<String, Object> listAssetReceive(AssetReceiveParams assetReceiveParams);

     int addAssetReceive(AssetReceiveParams assetReceiveParams);

     int updateAssetReceive(AssetReceiveParams assetReceiveParams);

     int deleteAssetReceive(AssetReceiveParams assetReceiveParams);
}
