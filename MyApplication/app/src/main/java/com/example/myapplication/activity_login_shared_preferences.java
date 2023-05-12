package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class activity_login_shared_preferences extends AppCompatActivity {

    AppCompatButton bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_shared_preferences);

        bt = findViewById(R.id.shared_preference_login_btn);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putBoolean("flag", true);
                editor.apply();

                Intent intent = new Intent(activity_login_shared_preferences.this,activity_logout_shared_preferences.class);
                startActivity(intent);



            }
        });




    }//create





































}//class