package com.example.giventrisjeremia.mymoviesproject.mainview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

import com.example.giventrisjeremia.mymoviesproject.R;

/**
 * Created by Giventris Jeremia on 20/05/2017.
 */

public class HomeActivity extends AppCompatActivity
{
    private TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtUsername     =(TextView)     findViewById(R.id.id_username2);

        Intent i = getIntent();
        Toast.makeText(this, i.getStringExtra("username"), Toast.LENGTH_SHORT).show();
        txtUsername.setText(i.getStringExtra("username"));
    }
}
