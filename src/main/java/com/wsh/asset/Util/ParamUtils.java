package com.wsh.asset.Util;

import org.apache.commons.lang.StringUtils;
import org.apache.tomcat.util.codec.binary.Base64;

import java.util.List;

public class ParamUtils {

    public static List limitPage(List list){
        int end = 0;
        int start = 0;
        int length = 5;
        //null值判断
        if (list == null)
            return  null;
        //如果start大于list的长度则从0开始
        if(list.size() < 5)
            start = 0;
        //如果截取的长度大于list的size则为size
        end = start + length > list.size() ? list.size():start + length;
        return list.subList(start, end);
    }

    public static List limitPage(List list, int start, int length){
        int end = 0;
        //null值判断
        if (list == null)
            return  null;
        //如果start大于list的长度则从0开始
        if(list.size() < start)
            start = 0;
        //如果截取的长度大于list的size则为size
        end = start + length > list.size() ? list.size():start + length;
        return list.subList(start, end);
    }

//    public static Map convertBase64(Map<String,Object> map){
//        String base64 = (String)map.get("base");
//        //将base64解码
//        if (StringUtils.isBlank(base64))
//            return null;
//        String user = new String(Base64.decodeBase64(base64));
//        String[] arr = user.split(" ");
//        map.put("username",arr[0]);
//        return map;
//    }

}
