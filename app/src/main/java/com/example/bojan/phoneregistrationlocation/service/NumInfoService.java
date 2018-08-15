package com.example.bojan.phoneregistrationlocation.service;

import com.example.bojan.phoneregistrationlocation.base.NumInfo;
import com.example.bojan.phoneregistrationlocation.manager.RetrofitManager;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Create by bojan
 * on 2018/8/15
 */
public interface NumInfoService {
    @Headers(RetrofitManager.CACHE_CONTROL_AGE + RetrofitManager.CACHE_STALE_LONG)
    @GET("/")
    Observable<NumInfo> getBeforeNews(@Query("app") String app
            , @Query("phone") String phone
            , @Query("appkey") String appkey
            , @Query("sign") String sign
            , @Query("format") String format);
}
