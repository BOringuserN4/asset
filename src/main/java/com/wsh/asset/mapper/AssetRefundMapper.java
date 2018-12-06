package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetRefundParams;

import java.util.List;
import java.util.Map;

public interface AssetRefundMapper {

    List<Map<String, Object>> listRefundAsset(AssetRefundParams assetRefundParams);

    int addRefundAsset(AssetRefundParams assetRefundParams);

    int updateRefundAsset(AssetRefundParams assetRefundParams);

    int deleteRefundAsset(AssetRefundParams assetRefundParams);
}
