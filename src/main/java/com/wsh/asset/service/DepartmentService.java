package com.wsh.asset.service;

import com.wsh.asset.comms.DepartmentParams;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface DepartmentService {

    Map<String, Object> listDepartment(DepartmentParams departmentParams);

    int addDepartment(DepartmentParams departmentParams);

    int updateDepartment(DepartmentParams departmentParams);

    int deleteDepartment(DepartmentParams departmentParams);
}
