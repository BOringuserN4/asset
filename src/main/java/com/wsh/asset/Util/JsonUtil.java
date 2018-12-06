package com.wsh.asset.Util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class JsonUtil {
        /**
         * 将数据 格式化为 Json格式
         *
         * @param code
         * @param msg
         * @param datas
         * @return
         */
        public static String formatJson(String code, String msg, Map<String, String> datas) {
            JSONObject jsonObj;
            jsonObj = new JSONObject();
            jsonObj.put("code", code);
            jsonObj.put("msg", msg);
            //jsonObj.put("data", datas);
            if(datas!=null && !datas.isEmpty()){
                JSONObject data=new JSONObject();
                for(String key:datas.keySet())
                {
                    data.put(key, datas.get(key));
                }
                jsonObj.put("data",data);
            }
            //return jsonObj.toString().replace("=",":");
            System.out.println(jsonObj.toString());
            return jsonObj.toString();
        }
        /**
         *
         * @param code
         * @param msg
         * @param listDatas
         * @return
         */
        public static String formatJsonList(String code, String msg, int count, List<Map<String, String>> listDatas) {

            JSONObject jsonObj = new JSONObject();
            jsonObj.put("code", code);
            jsonObj.put("msg", msg);
            jsonObj.put("count", count);
            // 第一种格式
            //String list = listDatas.toString();
            //jsonObj.put("data", list);
            JSONArray array=new JSONArray();
            for(Map<String,String> map : listDatas)
            {
                JSONObject tmp=new JSONObject();
                for(String key : map.keySet())
                {
                    tmp.put(key, map.get(key));
                }
                array.add(tmp);
            }
            jsonObj.put("data",array);
            // 第二种 格式
            // String [] lists=listDatas.toString().split(",");
            // jsonObj.put("data", lists);
            //return jsonObj.toString().replace("=", ":");
            return jsonObj.toString();
        }

        public static void response(HttpServletResponse response, String Json) {
            try {
                response.setContentType("text/html;charset=utf-8");
                response.setCharacterEncoding("UTF-8");
                PrintWriter out = new PrintWriter(new OutputStreamWriter(response.getOutputStream(), "UTF-8"));
                out.println(Json);
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


