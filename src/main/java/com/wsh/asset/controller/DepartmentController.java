package com.wsh.asset.controller;


import com.wsh.asset.Util.CommResponse;
import com.wsh.asset.comms.DepartmentParams;
import com.wsh.asset.service.DepartmentService;
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
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
    *获取部门信息
     *
     * @param departmentParams
     * @return
    */
    @RequestMapping(value = "listDepartment",method = RequestMethod.GET)
    public CommResponse getAllDepartment(DepartmentParams departmentParams){
        Map<String,Object> departmentList = departmentService.listDepartment(departmentParams);
        if(departmentList.isEmpty()){
            return CommResponse.success(new String[]{});
        }
        return CommResponse.success(departmentList);
    }


    /**
     *添加部门
     *
     * @param departmentParams
     * @return
     */
    @RequestMapping(value = "addDepartment",method = RequestMethod.POST)
    public CommResponse addDepartment(DepartmentParams departmentParams){
        int departmentCode = departmentService.addDepartment(departmentParams);
        return CommResponse.success(departmentCode);
    }


    /**
     *修改部门信息
     *
     * @param departmentParams
     * @return
     */
    @RequestMapping(value = "updateDepartment",method = RequestMethod.POST)
    public CommResponse updateDepartment(DepartmentParams departmentParams){
        int departmentCode = departmentService.updateDepartment(departmentParams);
        return CommResponse.success(departmentCode);
    }

    /**
     *删除部门
     *
     * @param departmentParams
     * @return
     */
    @RequestMapping(value = "deleteDepartment",method = RequestMethod.POST)
    public CommResponse deleteDepartment(DepartmentParams departmentParams){
        int departmentCode = departmentService.deleteDepartment(departmentParams);
        return CommResponse.success(departmentCode);
    }
}
