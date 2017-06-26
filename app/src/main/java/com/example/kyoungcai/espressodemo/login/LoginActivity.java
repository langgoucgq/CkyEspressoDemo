package com.example.kyoungcai.espressodemo.login;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kyoungcai.espressodemo.Data.LoginDaoImpl;
import com.example.kyoungcai.espressodemo.R;

public class LoginActivity extends AppCompatActivity {

    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        LoginFragment loginFragment = LoginFragment.newInstance("", "");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.flt_box,loginFragment);
        transaction.commit();
        loginPresenter=new LoginPresenterImpl(loginFragment,new LoginDaoImpl());
    }
}
