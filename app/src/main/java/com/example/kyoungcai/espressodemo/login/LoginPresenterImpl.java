package com.example.kyoungcai.espressodemo.login;

import com.example.kyoungcai.espressodemo.Data.LoginDao;

/**
 * Created by KyoungCai on 2017/6/26.
 */

public class LoginPresenterImpl implements LoginPresenter {


    private IView iView;
    private LoginDao loginDao;

    public LoginPresenterImpl(IView iView,LoginDao loginDao) {
        this.iView=iView;
        this.loginDao=loginDao;
        iView.setPresenter(this);

    }

    @Override
    public void login(String username, String pwd) {
        //如果需要ui界面有动作则调用view层方法
        //比如需要ui界面显示请等待
        iView.login();

        boolean canLogin = loginDao.login(username, pwd);
        if(canLogin){
            //调用view层跳转
            iView.gotoMain();
        }else{
            //提示错误
            iView.showMessage();
        }
    }
}
