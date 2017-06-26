package com.example.kyoungcai.espressodemo.Data;


import android.os.Handler;

/**
 * Created by KyoungCai on 2017/6/26.
 */

public class LoginDaoImpl implements LoginDao {
    @Override
    public boolean login(String username, String password) {
        //进行网络请求 比如登陆
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(username.equals("admin")&&password.equals("1234")){
            return true;
        }
        return false;
    }
}
