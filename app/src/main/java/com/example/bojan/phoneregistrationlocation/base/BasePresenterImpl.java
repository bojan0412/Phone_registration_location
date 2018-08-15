package com.example.bojan.phoneregistrationlocation.base;

/**
 * Create by bojan
 * on 2018/8/15
 */
public class BasePresenterImpl<T extends IBaseView, V> implements IBasePresenter {
    public IBaseView iView;

    public BasePresenterImpl(T view) {
        this.iView = view;
    }

    @Override
    public void beforeRequest() {
        iView.showProgress();
    }

    @Override
    public void requestError(Throwable e) {
        iView.loadFail(e);
    }

    @Override
    public void requestComplete() {
        iView.hideProgress();
    }

    @Override
    public void retuestSuccess(Object callBack) {
        iView.loadSucess(callBack);
    }
}
