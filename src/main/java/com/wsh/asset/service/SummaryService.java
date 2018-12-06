package com.wsh.asset.service;

import com.wsh.asset.comms.SummaryParams;

import java.util.Map;

public interface SummaryService {

    Map<String,Object>  listSummary(SummaryParams summaryParams);

    Map<String, Object> listClassifyRadio(SummaryParams summaryParams);

    Map<String, Object> listBrandCount(SummaryParams summaryParams);

    Map<String, Object> listUseStatus(SummaryParams summaryParams);

    Map<String, Object> listOtherStatus(SummaryParams summaryParams);

}
