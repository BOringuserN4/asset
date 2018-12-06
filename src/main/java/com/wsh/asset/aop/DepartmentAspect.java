package com.wsh.asset.aop;

import com.wsh.asset.mapper.DepartmentMapper;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Map;



/**
 * @author: yuexin
 * @Date: 2018/11/2 0002 19:19
 */

@Aspect
@Component
public class DepartmentAspect {

    @Autowired
    private DepartmentMapper departmentMapper;

    //对com.wsh.asset.service.DepartmentService进行切面处理
    @Pointcut("execution(public * com.wsh.asset.service.DepartmentService.*(..))")
    public void pointCutMethod(){

    }

    @Before("pointCutMethod()")
    public void doBefore() {

//        int i,j=0,k=0;
//        int[] exisParent = new int[100];
//        int[] parent = new int[100];
//        Integer[] finalId = new Integer[100];
//        List<Map<String,Object>> depMap = departmentMapper.listDepartmentParentId();
        /**
         * 将获取的数据分别放入两个整型数组
         */
//        for(i=0,j=0; i<depMap.size(); i++){
//            if(depMap.get(i).size()>1) {
//                Map<String,Object> depWithParent = depMap.get(i);
//                //使用迭代器获取map中的value值
//                Iterator<String> iter = depWithParent.keySet().iterator();
//                String key = iter.next();
//                exisParent[j] = (int)depWithParent.get(key);
//                //因为只select了两个数据，并未利用循环遍历
//                String nextkey = iter.next();
//                parent[j] = (int)depWithParent.get(nextkey);
//                j++;
//            }
//        }
    }
}
