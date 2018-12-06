package com.wsh.asset.mapper;

import com.wsh.asset.comms.SummaryParams;

import java.util.List;
import java.util.Map;

public interface SummaryMapper {

    List<Map<String, Object>> listSummary(SummaryParams summaryParams);

    List<Map<String, Object>> listClassifyRadio(SummaryParams summaryParams);

    List<Map<String, Object>> listBrandCount(SummaryParams summaryParams);

    List<Map<String, Object>> listUseStatus(SummaryParams summaryParams);

    List<Map<String, Object>> listOtherStatus(SummaryParams summaryParams);
}
