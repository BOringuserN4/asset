package com.wsh.asset.controller;

import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.comms.SummaryParams;
import com.wsh.asset.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: yuexin
 * @Date: 2018/9/1 10:55
 */
@RestController
@RequestMapping("/summary")
public class SummaryController {

    @Autowired
    private SummaryService summaryService;

    //不通
    /**
     * 资产状态时间数量统计
     *
     * @param summaryParams
     * @return
     */
    @RequestMapping(value = "listSummaryByTime", method = RequestMethod.GET)
    public CommResponse listsummary(SummaryParams summaryParams){
        Map<String,Object> summaryMap = summaryService.listSummary(summaryParams);
        if(summaryMap.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(summaryMap);
    }

    /**
     * 资产分类数量百分比统计
     *
     * @param summaryParams
     * @return
     */
    @RequestMapping(value = "listSummaryByClassify", method = RequestMethod.GET)
    public CommResponse listClassifyRadio(SummaryParams summaryParams){
        Map<String,Object> summaryMap = summaryService.listClassifyRadio(summaryParams);
        if(summaryMap.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(summaryMap);
    }

    /**
     * 资产品牌数量统计
     *
     * @param summaryParams
     * @return
     */
    @RequestMapping(value = "listSummaryByBrand", method = RequestMethod.GET)
    public CommResponse listBandCount(SummaryParams summaryParams){
        Map<String,Object> summaryMap = summaryService.listBrandCount(summaryParams);
        if(summaryMap.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(summaryMap);
    }

    /**
     * 资产数量统计（总数，闲置，使用中，）个数，价格，百分比
     *
     * @param summaryParams
     * @return
     */
    @RequestMapping(value = "listSummaryByAllCount", method = RequestMethod.GET)
    public CommResponse listUseStatus(SummaryParams summaryParams){
        Map<String,Object> summaryMap = summaryService.listUseStatus(summaryParams);
        if(summaryMap.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(summaryMap);
    }

    //不通
    /**
     * 资产数量统计（正常资产，维修遗失，报废）个数，价格，百分比
     *
     * @param summaryParams
     * @return
     */
    @RequestMapping(value = "listSummary5", method = RequestMethod.GET)
    public CommResponse listOtherStatus(SummaryParams summaryParams){
        Map<String,Object> summaryMap = summaryService.listSummary(summaryParams);
        if(summaryMap.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(summaryMap);
    }

}
