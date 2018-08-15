package com.example.bojan.phoneregistrationlocation.base;

/**
 * Create by bojan
 * on 2018/8/15
 */
public interface IBaseView<T> {

    void toast(String msg);

    void showProgress();

    void hideProgress();

    void loadSucess(T data);

    void loadFail(Throwable e);
}

