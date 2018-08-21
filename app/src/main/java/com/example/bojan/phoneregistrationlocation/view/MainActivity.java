package com.example.bojan.phoneregistrationlocation.view;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bojan.phoneregistrationlocation.R;
import com.example.bojan.phoneregistrationlocation.base.NumInfo;
import com.example.bojan.phoneregistrationlocation.presenter.NumPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements NumInfoView, View.OnClickListener {
    private ProgressDialog progressDialog;

    private NumPresenterImpl phonePresenter;
    @BindView(R.id.phonenum)
    EditText phoneNum;

    @BindView(R.id.msg)
    TextView msg;
    @BindView(R.id.getphoneinfo)
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mButton.setOnClickListener(this);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading");
        phonePresenter = new NumPresenterImpl(this);
    }


    @Override
    public void toast(String msg) {

    }

    @Override
    public void showProgress() {
        if (null != progressDialog && !progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    @Override
    public void hideProgress() {
        if (null != progressDialog && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void loadSucess(NumInfo data) {
        msg.setText(data.toString());
    }

    @Override
    public void loadFail(Throwable e) {
        msg.setText(e.getMessage());
    }

    @Override
    public void onClick(View v) {
        phonePresenter.getPhoneNumInfo(phoneNum.getText().toString());
    }
}
