package com.wsh.asset.mapper;

import com.wsh.asset.comms.AssetClassifyParams;

import java.util.List;
import java.util.Map;


public interface AssetClassifyMapper {

    List<Map<String, Object>> listAssetClassify(AssetClassifyParams assetClassifyParams);

    int addAssetClassify(AssetClassifyParams assetClassifyParams);

    int updateAssetClassify(AssetClassifyParams assetClassifyParams);

    int deleteAssetClassify(AssetClassifyParams assetClassifyParams);

}
