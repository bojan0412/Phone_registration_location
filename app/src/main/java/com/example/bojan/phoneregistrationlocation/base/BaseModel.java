package com.example.bojan.phoneregistrationlocation.base;

import com.example.bojan.phoneregistrationlocation.manager.RetrofitManager;

/**
 * Create by bojan
 * on 2018/8/17
 */
public class BaseModel {
    public RetrofitManager mRetrofitManager;
    public  BaseModel(){mRetrofitManager=RetrofitManager.builder();}
}
