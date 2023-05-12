package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activity_shared_preference extends AppCompatActivity {

    EditText  et1,et2,et3,et4;
    AppCompatButton bt1,bt2,bt3;
    SharedPreferences sharedPreferences;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        et1 = findViewById(R.id.shared_preference_first_name_singup);
        et2 = findViewById(R.id. shared_preference_surname_singup);
        et3 = findViewById(R.id.shared_preference_email_singup);
        et4 = findViewById(R.id.shared_preference_pass_singup);

        bt1 = findViewById(R.id.shared_preference_btn_save);
        bt2 = findViewById(R.id.shared_preference_btn_show);
        bt3 = findViewById(R.id.shared_preference_btn_delete);

        sharedPreferences = getSharedPreferences("data" , MODE_PRIVATE);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("first_name",et1.getText().toString());
                editor.putString("surname",et2.getText().toString());
                editor.putString("email",et3.getText().toString());
                editor.putString("password",et4.getText().toString());

                editor.apply();


                Toast.makeText(activity_shared_preference.this, "SAVE!", Toast.LENGTH_SHORT).show();
            }


        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sharedPreferences.contains("first_name")){

                    et1.setText(sharedPreferences.getString("first_name",""));

                }

                if(sharedPreferences.contains("surname")){

                    et2.setText(sharedPreferences.getString("surname",""));

                }

                if(sharedPreferences.contains("email")){

                    et3.setText(sharedPreferences.getString("email",""));

                }
                if(sharedPreferences.contains("password")){

                    et4.setText(sharedPreferences.getString("password",""));

                }

                Toast.makeText(activity_shared_preference.this, "SHOW!", Toast.LENGTH_SHORT).show();
            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();

                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");

                Toast.makeText(activity_shared_preference.this, "DELETE!+", Toast.LENGTH_SHORT).show();

            }
        });















    }//create












































}//class