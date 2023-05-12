package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class activity_splash_shared_preferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_shared_preferences);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
                Boolean check = sharedPreferences.getBoolean("flag", false);

                Intent intent;

                if (check){

                    intent = new Intent(activity_splash_shared_preferences.this,activity_logout_shared_preferences.class);

                }else {

                    intent = new Intent(activity_splash_shared_preferences.this,activity_login_shared_preferences.class);

                }

                startActivity(intent);

            }
        }, 4000);





    }//create

































}//class