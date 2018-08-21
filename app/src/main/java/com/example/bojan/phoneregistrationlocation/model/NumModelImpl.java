package com.example.bojan.phoneregistrationlocation.model;

import com.example.bojan.phoneregistrationlocation.base.BaseModel;
import com.example.bojan.phoneregistrationlocation.base.IBasePresenter;
import com.example.bojan.phoneregistrationlocation.base.NumInfo;
import com.example.bojan.phoneregistrationlocation.service.NumInfoService;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Create by bojan
 * on 2018/8/17
 */
public class NumModelImpl extends BaseModel {
    private NumInfoService mNumInfoService;
    public NumModelImpl(){
        super();
        mNumInfoService=mRetrofitManager.getService();
    }

    public void loadPhoneNumInfo(String phoneNum, final IBasePresenter<NumInfo> callBack) {
        mNumInfoService.getBeforeNews("phone.get", phoneNum, "35982", "d25b32f68d595320da52e3fe7165ccda", "json")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NumInfo>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        callBack.beforeRequest();
                    }

                    @Override
                    public void onNext(NumInfo numInfo) {
                        {
                            if (null != numInfo && numInfo.getSuccess().equals("1"))
                                callBack.requestSuccess(numInfo);
                            else if (null != numInfo && numInfo.getSuccess().equals("0"))
                                callBack.requestError(new Exception(numInfo.getMsg()));
                            else
                                callBack.requestError(new Exception("获取数据错误，请重试！"));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.requestError(e);
                    }

                    @Override
                    public void onComplete() {
                        callBack.requestComplete();
                    }

                });
    }
}
