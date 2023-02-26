package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_AdditionApp extends AppCompatActivity {

    EditText value1,value2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_app);

       value1 = findViewById(R.id.value1);
       value2 = findViewById(R.id.value2);
       button = findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int n1 = Integer.parseInt(value1.getText().toString());
               int n2 = Integer.parseInt(value2.getText().toString());
               int sum = n1 + n2;
               Toast.makeText(activity_AdditionApp.this, "Answer:-> " +sum, Toast.LENGTH_LONG).show();
           }
       });

    }
}