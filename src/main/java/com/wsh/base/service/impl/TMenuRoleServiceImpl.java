package com.wsh.base.service.impl;

import com.wsh.base.mapper.TMenuRoleMapper;
import com.wsh.base.param.TMenuRoleParams;
import com.wsh.base.service.TMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: shanghai
 * @Date: 2018/9/11 16:03
 */
@Service
public class TMenuRoleServiceImpl implements TMenuRoleService {

    @Autowired
    private TMenuRoleMapper tMenuRoleMapper;

    @Override
    public List<Map<String,Object>> listTMenuRole(TMenuRoleParams tMenuRoleParams) {
        List<Map<String,Object>> tMenuRoleList = tMenuRoleMapper.listtMenuRole(tMenuRoleParams);
        return tMenuRoleList;
    }

    @Override
    public Integer[] addTMenuRole(TMenuRoleParams tMenuRoleParams) {
        /*
         * 实现增加操纵为，先一个个截取eleOfMenuId数组中的元素的值
         * 暂时存放在所声明的eleOfMenu数组中，TrmrRoleId的值不变，
         * 不断的遍历eleOfMenuId数组中的元素对应存入数据库中
         * */
        Integer[] eleOfMenu;
        eleOfMenu=tMenuRoleParams.getTrmrMenuId();
        for(Integer i:eleOfMenu){
            tMenuRoleParams.setTrmrMenu(eleOfMenu[i]);
            tMenuRoleMapper.addtMenuRole(tMenuRoleParams);
        }
        return eleOfMenu;
    }

    @Override
    public Integer[] updateTMenuRole(TMenuRoleParams tMenuRoleParams) {
        /*
        *实现方法为，先将需要更新的数据全部删除，后再全部重新添加
        * */
        Integer[] eleOfMenu;
        tMenuRoleMapper.deletetMenuRole(tMenuRoleParams);
        eleOfMenu=tMenuRoleParams.getTrmrMenuId();
        for(Integer i:eleOfMenu){
            tMenuRoleParams.setTrmrMenu(eleOfMenu[i]);
            tMenuRoleMapper.addtMenuRole(tMenuRoleParams);
        }
        return eleOfMenu;
    }

    @Override
    public int deleteTMenuRole(TMenuRoleParams tMenuRoleParams) {
        int tMenuRoleCode = tMenuRoleMapper.deletetMenuRole(tMenuRoleParams);
        return tMenuRoleCode;
    }

}

