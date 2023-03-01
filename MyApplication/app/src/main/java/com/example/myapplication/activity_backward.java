package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class activity_backward extends AppCompatActivity {

    ImageView iv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backward);

        iv = findViewById(R.id.arrow_tv);
        btn = findViewById(R.id.btn_backward);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                iv.setImageResource(R.drawable.baseline_arrow_back_24);
//            }
//        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),activity_forward_arrow.class);
                String back = "BACKWARD!!";
                i.putExtra("key_Activity",back);
                startActivity(i);
            }
        });




        Intent i = getIntent();

        String forward = i.getStringExtra("key_activity");

        Toast.makeText(this, "" + forward , Toast.LENGTH_SHORT).show();

    }
}