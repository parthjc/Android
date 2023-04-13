package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_toast extends AppCompatActivity {

    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        btnClick = findViewById(R.id.clickBtn);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(ToastActivity.this, "Button Clicked ", Toast.LENGTH_LONG).show();

                Toast t = Toast.makeText(activity_toast.this, "Button Clicked ", Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}

/*
context
text
duration:
LENGTH_LONG
LENGTH_SHORT




 */