package com.example.giventrisjeremia.mymoviesproject.mainview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.giventrisjeremia.mymoviesproject.R;
import com.example.giventrisjeremia.mymoviesproject.maininteractor.InterfaceMain;
import com.example.giventrisjeremia.mymoviesproject.maininteractor.InterfacePresenter;

public class MainActivity extends AppCompatActivity implements InterfaceMain{
    private EditText edt_Username, edt_Password;
    private Button btn_Login;
    private InterfacePresenter mInterfacePresenter;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_Username = (EditText) findViewById(R.id.id_username);
        edt_Password = (EditText) findViewById(R.id.id_pass);
        btn_Login = (Button) findViewById(R.id.id_button);

        mInterfacePresenter = new MainPresenter(this);

        btn_Login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                mInterfacePresenter.login(edt_Username.getText().toString(),
                        edt_Password.getText().toString());
            }
        });


    }

    @Override
    public void showError() {

    }

    @Override
    public void messageError() {
        Toast.makeText(this, "Username or password is empty", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Username or password is wrong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(String username, String password) {
        Toast.makeText(this, "Login success!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, HomeActivity.class);
        i.putExtra("username", username);
        i.putExtra("password", password);
        startActivity(i);
    }
}
