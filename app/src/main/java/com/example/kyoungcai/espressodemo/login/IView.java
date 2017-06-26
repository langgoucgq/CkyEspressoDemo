package com.example.kyoungcai.espressodemo.login;

/**
 * Created by KyoungCai on 2017/6/26.
 */

public interface IView {

    void login();

    void setPresenter(LoginPresenter loginPresenter);

    void gotoMain();

    void showMessage();
}
