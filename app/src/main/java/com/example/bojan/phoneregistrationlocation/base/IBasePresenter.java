package com.example.bojan.phoneregistrationlocation.base;

/**
 * Create by bojan
 * on 2018/8/15
 */
public interface IBasePresenter<T> {

    void beforeRequest();

    void requestError(Throwable e);

    void requestComplete();

    void retuestSuccess(T callBack);
}
