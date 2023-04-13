package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_reset_dialogbox extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_dialogbox);

        btn = findViewById(R.id.diallogbox_resetbtn);

        Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.activity_custom_dialogbox);

        Button btn2  = dialog.findViewById(R.id.diallogbox_closebtn);

        dialog.setCancelable(false);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.show();

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

            }
        });




    }//oncreate

































}//class