package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class activity_forward_arrow extends AppCompatActivity {

    ImageView iv;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forward_arrow);

        iv = findViewById(R.id.arrow_tv);
        btn = findViewById(R.id.btn_forward);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                iv.setImageResource(R.drawable.baseline_arrow_back_24);
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),activity_backward.class);
                String forward = "FORWARD!!!";
                i.putExtra("key_activity",forward);
                startActivity(i);
            }
        });

        Intent i = getIntent();

        String back = i.getStringExtra("key_Activity");

        Toast.makeText(this, "" + back, Toast.LENGTH_SHORT).show();




    }
}