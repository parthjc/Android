package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_singup_bmi extends AppCompatActivity {

    Button btn1,btn2;
    ImageView iv;
    TextView tv1,tv2;
    EditText et1,et2,et3,et4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_bmi);

        getSupportActionBar().hide();

        btn1 = findViewById(R.id.singu_btn);
        btn2 = findViewById(R.id.back_login);
        iv = findViewById(R.id.bmi_logo_singup);
        tv1 = findViewById(R.id.singup_txt);
        tv2 = findViewById(R.id.alreday_acc_msg);
        et1 = findViewById(R.id.first_name_singup);
        et2 = findViewById(R.id.surname_singup);
        et3 = findViewById(R.id.bmi_email_singup);
        et4 = findViewById(R.id.bmi_pass_singup);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),activity_login.class);
                startActivity(intent);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),activity_login.class);
                startActivity(intent);

            }
        });




























    }//fun





























}//calss