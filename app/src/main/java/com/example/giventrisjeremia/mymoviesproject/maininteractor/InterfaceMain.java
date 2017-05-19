package com.example.giventrisjeremia.mymoviesproject.maininteractor;

/**
 * Created by Giventris Jeremia on 20/05/2017.
 */

public interface InterfaceMain {
    void showError();

    void messageError();

    void loginError();

    void loginSuccess(String username, String password);
}
