package com.example.kyoungcai.espressodemo.Data;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by KyoungCai on 2017/6/26.
 */
public class LoginDaoImplTest {

    private LoginDao loginDao;
    @org.junit.Before
    public void setUp() throws Exception {
        loginDao=new LoginDaoImpl();

    }

    @Test
    public void testLogin(){
        boolean canlogin=loginDao.login("admin","1234");
        Assert.assertEquals(canlogin,true);

    }


}