package com.example.icmi.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 发起网络请求得到数据--获取接口中全国的数据
 */
public class HttpUtil {
    /*
        发送http请求
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }


}
