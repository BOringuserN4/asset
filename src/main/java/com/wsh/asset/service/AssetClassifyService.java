package com.wsh.asset.service;

import com.wsh.asset.comms.AssetClassifyParams;

import java.util.Map;


public interface AssetClassifyService {

    Map<String,Object> listAssetClassify(AssetClassifyParams assetClassifyParams);

    int addAssetClassify(AssetClassifyParams assetClassifyParams);

    int updateAssetClassify(AssetClassifyParams assetClassifyParams);

    int deleteAssetClassify(AssetClassifyParams assetClassifyParams);


}
