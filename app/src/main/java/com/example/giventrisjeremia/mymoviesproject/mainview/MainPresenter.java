package com.example.giventrisjeremia.mymoviesproject.mainview;

import android.text.TextUtils;

import com.example.giventrisjeremia.mymoviesproject.maininteractor.InterfaceMain;
import com.example.giventrisjeremia.mymoviesproject.maininteractor.InterfacePresenter;

/**
 * Created by Giventris Jeremia on 20/05/2017.
 */

public class MainPresenter implements InterfacePresenter{
    private InterfaceMain mInterfaceMain;

    public MainPresenter(InterfaceMain mInterfaceMain){
        this.mInterfaceMain = mInterfaceMain;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) ||  TextUtils.isEmpty(password)){
            mInterfaceMain.messageError();
        }
        else {
            if (username.equals("admin") && password.equals("admin")){
                mInterfaceMain.loginSuccess(username, password);
            }
            else {
                mInterfaceMain.loginError();
            }
        }
    }
}
