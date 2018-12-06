package com.wsh.asset.service.impl;

import com.wsh.asset.Util.ParamUtils;
import com.wsh.asset.comms.DepartmentParams;
import com.wsh.asset.mapper.DepartmentMapper;
import com.wsh.asset.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Map<String, Object> listDepartment(DepartmentParams departmentParams) {
        List<Map<String,Object>> departmentList = departmentMapper.listDepartment(departmentParams);
        List<Map<String,Object>> list= ParamUtils.limitPage(departmentList,departmentParams.getStart(),departmentParams.getLength());
        int count = departmentList.size();
        Map<String,Object> assetMap= new HashMap<String, Object>();
        assetMap.put("list",list);
        assetMap.put("count",count);
        return assetMap;
    }


    @Override
    public int addDepartment(DepartmentParams departmentParams) {
        int departmentCode = departmentMapper.addDepartment(departmentParams);
        return departmentCode;
    }

    @Override
    public int updateDepartment(DepartmentParams departmentParams) {
        int departmentCode = departmentMapper.updateDepartment(departmentParams);
        return departmentCode;
    }

    @Override
    public int deleteDepartment(DepartmentParams departmentParams) {
        int departmentCode = departmentMapper.deleteDepartment(departmentParams);
        return departmentCode;
    }

}
