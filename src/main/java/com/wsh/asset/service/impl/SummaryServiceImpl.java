package com.wsh.asset.service.impl;

import com.wsh.asset.comms.SummaryParams;
import com.wsh.asset.service.SummaryService;
import com.wsh.asset.mapper.SummaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SummaryServiceImpl implements SummaryService {

    @Autowired
    private SummaryMapper summaryMapper;

    @Override
    public Map<String,Object> listSummary(SummaryParams summaryParams) {
        Date startdate = new Date();
        startdate.setYear(summaryParams.getLimitStartTime().getYear());
        startdate.setMonth(summaryParams.getLimitStartTime().getYear());
        startdate.setDate(summaryParams.getLimitStartTime().getDay());
        startdate.setHours(0);
        startdate.setMinutes(0);
        startdate.setSeconds(0);
        summaryParams.setLimitStartTime(startdate);

        Date enddate = new Date();
        enddate.setYear(summaryParams.getLimitEndTime().getYear());
        enddate.setMonth(summaryParams.getLimitEndTime().getYear());
        enddate.setDate(summaryParams.getLimitEndTime().getDay());
        enddate.setHours(23);
        enddate.setMinutes(59);
        enddate.setSeconds(59);
        summaryParams.setLimitEndTime(enddate);

        List<Map<String,Object>> summaryList = summaryMapper.listSummary(summaryParams);
        int count = summaryList.size();
        Map<String,Object> summaryMap= new HashMap<String, Object>();;
        summaryMap.put("list",summaryList);
        summaryMap.put("count",count);
        return summaryMap;
    }

    @Override
    public Map<String, Object> listClassifyRadio(SummaryParams summaryParams) {
        List<Map<String,Object>> summaryList = summaryMapper.listClassifyRadio(summaryParams);
        int count = summaryList.size();
        Map<String,Object> summaryMap= new HashMap<String, Object>();;
        summaryMap.put("list",summaryList);
        summaryMap.put("count",count);
        return summaryMap;
    }

    @Override
    public Map<String, Object> listBrandCount(SummaryParams summaryParams) {
        List<Map<String,Object>> summaryList = summaryMapper.listBrandCount(summaryParams);
        int count = summaryList.size();
        Map<String,Object> summaryMap= new HashMap<String, Object>();;
        summaryMap.put("list",summaryList);
        summaryMap.put("count",count);
        return summaryMap;
    }

    @Override
    public Map<String, Object> listUseStatus(SummaryParams summaryParams) {
        List<Map<String,Object>> summaryList = summaryMapper.listUseStatus(summaryParams);
        int count = summaryList.size();
        Map<String,Object> summaryMap= new HashMap<String, Object>();;
        summaryMap.put("list",summaryList);
        summaryMap.put("count",count);
        return summaryMap;
    }

    @Override
    public Map<String, Object> listOtherStatus(SummaryParams summaryParams) {
        List<Map<String,Object>> summaryList = summaryMapper.listOtherStatus(summaryParams);
        int count = summaryList.size();
        Map<String,Object> summaryMap= new HashMap<String, Object>();
        summaryMap.put("list",summaryList);
        summaryMap.put("count",count);
        return summaryMap;
    }

}
