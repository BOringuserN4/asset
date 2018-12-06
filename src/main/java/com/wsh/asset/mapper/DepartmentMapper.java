package com.wsh.asset.mapper;

import com.wsh.asset.comms.DepartmentParams;

import java.util.List;
import java.util.Map;

public interface DepartmentMapper {

    List<Map<String, Object>> listDepartment(DepartmentParams departmentParams);

    List<Map<String, Object>> listDepartmentParentId();

    int addDepartment(DepartmentParams departmentParams);

    int updateDepartment(DepartmentParams departmentParams);

    int deleteDepartment(DepartmentParams departmentParams);
}
