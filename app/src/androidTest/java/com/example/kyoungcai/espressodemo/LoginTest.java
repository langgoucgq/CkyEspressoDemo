package com.example.kyoungcai.espressodemo;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.kyoungcai.espressodemo.login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by KyoungCai on 2017/6/26.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTest {
    @Rule
    public ActivityTestRule<LoginActivity> loginActivityActivityTestRule=new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void loginTest(){
        /*Espresso.onView(ViewMatchers.withId(R.id.ed_uname)).perform(ViewActions.typeText("android"),ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.ed_pwd)).perform(ViewActions.typeText("test"), ViewActions.closeSoftKeyboard());*/

        Espresso.onView(ViewMatchers.withId(R.id.ed_uname)).perform(ViewActions.typeText("admin"),ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.ed_pwd)).perform(ViewActions.typeText("1234"),ViewActions.closeSoftKeyboard());

        Espresso.onView(ViewMatchers.withId(R.id.btn)).perform(ViewActions.click());




    }


}
