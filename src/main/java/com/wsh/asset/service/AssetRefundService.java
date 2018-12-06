package com.wsh.asset.service;

import com.wsh.asset.comms.AssetRefundParams;

import java.util.Map;


public interface AssetRefundService {

    Map<String, Object> listRefundAsset(AssetRefundParams assetRefundParams);

    int addRefundAsset(AssetRefundParams assetRefundParams);

    int updateRefundAsset(AssetRefundParams assetRefundParams);

    int deleteRefundAsset(AssetRefundParams assetRefundParams);
}
