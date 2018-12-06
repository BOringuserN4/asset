package com.wsh.asset.Util;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: yuexin
 * @Date: 2018/12/3 0003 19:01
 */
public class DateConverter implements Converter<String, Date> {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //自定义类型转换，将java的数据类型转换为字符串显示
    @Override
    public Date convert(String s) {
        //空值判断
        if ("".equals(s) || s == null) {
            return null;
        }
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
