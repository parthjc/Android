package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_AdditionApp extends AppCompatActivity {

    EditText value1, value2;
    Button button, button_mul, button_sub, button_div;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_app);

        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        button = findViewById(R.id.button_add);
        button_mul = findViewById(R.id.button_mul);
        button_sub = findViewById(R.id.button_sub);
        button_div = findViewById(R.id.button_div);
        ans = findViewById(R.id.answer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (value1.getText().toString().length() > 0 && value2.getText().toString().length() > 0) {
                    int n1 = Integer.parseInt(value1.getText().toString());
                    int n2 = Integer.parseInt(value2.getText().toString());
                    int sum = n1 + n2;
                    ans.setText("Answer " + sum);
                    Toast.makeText(activity_AdditionApp.this, "Answer:-> " + sum, Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(activity_AdditionApp.this, "INVALID VALUE!!! ", Toast.LENGTH_LONG).show();

                }


            }

        });


        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (value1.getText().toString().length() > 0 && value2.getText().toString().length() > 0) {
                    int n1 = Integer.parseInt(value1.getText().toString());
                    int n2 = Integer.parseInt(value2.getText().toString());
                    int mul = n1 * n2;
                    ans.setText("Answer " + mul);
                    Toast.makeText(activity_AdditionApp.this, "Answer:-> " + mul, Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(activity_AdditionApp.this, "INVALID VALUE!!! ", Toast.LENGTH_LONG).show();

                }


            }

        });


        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (value1.getText().toString().length() > 0 && value2.getText().toString().length() > 0) {
                    int n1 = Integer.parseInt(value1.getText().toString());
                    int n2 = Integer.parseInt(value2.getText().toString());
                    int sub = n1 - n2;
                    ans.setText("Answer " + sub);
                    Toast.makeText(activity_AdditionApp.this, "Answer:-> " + sub, Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(activity_AdditionApp.this, "INVALID VALUE!!! ", Toast.LENGTH_LONG).show();

                }


            }

        });


        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (value1.getText().toString().length() > 0 && value2.getText().toString().length() > 0) {
                    int n1 = Integer.parseInt(value1.getText().toString());
                    int n2 = Integer.parseInt(value2.getText().toString());
                    int div = n1 / n2;
                    ans.setText("Answer " + div);
                    Toast.makeText(activity_AdditionApp.this, "Answer:-> " + div, Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(activity_AdditionApp.this, "INVALID VALUE!!! ", Toast.LENGTH_LONG).show();

                }


            }

        });


    }

}