package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_frgmt_xyz extends AppCompatActivity {

    Button btnx,btny,btnz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frgmt_xyz);

        btnx = findViewById(R.id.btn_x);
        btny = findViewById(R.id.btn_y);
        btnz = findViewById(R.id.btn_z);

        onLoad(new XFragment(),0);


        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoad(new XFragment(),1);
            }
        });

        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoad(new YFragment(),1);

            }
        });

        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoad(new ZFragment(),1);
            }
        });













    }//oncreate

    private void onLoad(Fragment f, int flag) {

     FragmentManager fragmentManager = getSupportFragmentManager();
     FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

     if (flag == 0){

         fragmentTransaction.add(R.id.frame, f);

     }else {

         fragmentTransaction.replace(R.id.frame, f);
     }


     fragmentTransaction.commit();



    }


}//class