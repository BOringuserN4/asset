package com.wsh.asset.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateNumber {

    /*
    * 单号自动生成
    *
    * */
    public static String  createNum(int num){
        String number = null;
        /**
        * 写法暂存问题，代改正
         *  使用枚举类型进行添加
        */
        switch(num){
            case 1: //if(num==1) 资产入库
                number="RK"+gettime()+(int)(Math.random()*9+1)*10;
                break;

            case 2: //if(num==2) 出库领用
                number="LY"+gettime()+(int)(Math.random()*9+1)*10;
                break;

            case 3: //if(num==3) 资产转移
                number="ZY"+gettime()+(int)(Math.random()*9+1)*10;
                break;

            case 4: //if(num==4) 资产退库
                number="TK"+gettime()+(int)(Math.random()*9+1)*10;
                break;

            case 5: //if(num==5) 资产维修
                number="WX"+gettime()+(int)(Math.random()*9+1)*10;
                break;

            case 6: //if(num==6) 清理报废
                number="BF"+gettime()+(int)(Math.random()*9+1)*10;
                break;

            case 7: //if(num==7) 资产盘点
                number="PD"+gettime()+(int)(Math.random()*9+1)*10;
                break;

            default:
                number="This number is wrong";
                break;
        }
        return number;
    }

    public static String gettime(){

        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");

        return fmt.format(new Date());
    }
}
