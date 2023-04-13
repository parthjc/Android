package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {

    ImageView iv;
    EditText et1,et2;
    Button btn1,btn2;
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        iv = findViewById(R.id.bmi_logo_login);
        tv1 = findViewById(R.id.login_txt);
        tv2 = findViewById(R.id.alreday_acc_msg);
        et1 = findViewById(R.id.user_name_edt);
        et2 = findViewById(R.id.pass_edt);
        btn1 = findViewById(R.id.login_btn);
        btn2 = findViewById(R.id.not_create_Acc);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(activity_login.this, activitybmi_calculator.class);
                startActivity(intent1);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(activity_login.this, activity_singup_bmi.class);
                startActivity(intent2);
            }
        });




















    }//fun





































}//calss