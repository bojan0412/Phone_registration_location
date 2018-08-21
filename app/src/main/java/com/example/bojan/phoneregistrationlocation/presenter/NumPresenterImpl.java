package com.example.bojan.phoneregistrationlocation.presenter;

import com.example.bojan.phoneregistrationlocation.base.BasePresenterImpl;
import com.example.bojan.phoneregistrationlocation.base.NumInfo;
import com.example.bojan.phoneregistrationlocation.model.NumModelImpl;
import com.example.bojan.phoneregistrationlocation.view.NumInfoView;

/**
 * Create by bojan
 * on 2018/8/17
 */
public class NumPresenterImpl extends BasePresenterImpl<NumInfoView> {
    private NumModelImpl mNumModel;


    public NumPresenterImpl(NumInfoView view) {
        super(view);
        mNumModel = new NumModelImpl();
    }

    public void getPhoneNumInfo(String phoneNum) {
        mNumModel.loadPhoneNumInfo(phoneNum,this);
    }
}
