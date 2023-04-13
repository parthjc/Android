package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_grid_view extends AppCompatActivity {

    GridView gv;
    ArrayList<Integer> arrayListint = new ArrayList<Integer>();
    ArrayList<String> arraylistgrid = new ArrayList<>();

    String[] gridviewarry  = new String[] {

            "MICROSOFT",
            "APPLE",
            "LTI",
            "DELOITTE",
            "COCA COLA",
            "TCS",
            "ACCENTURE",
            "IBM",
            "GOOGLE",
            "BMW",
            "MERCEDES",
            "HONDA",
            "TATA",
            "TOYOTA",
            "BAJAJ",
            "FROD",
            "VOLKSWAGEN",
            "FERRARI",
            "BENTLY",
            "LG",
            "SAMSUNG",
            "NOKIA",
            "ACER",
            "LENOVO",
            "DELL",
            "HP",
            "MOTOROLA",
            "VIVO",
            "OPPO",
            "ONEPLUS"



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);



        gv = findViewById(R.id.grid_view);

        for (int i=0; i<gridviewarry.length; i++){

               gridviewarry.clone();

        }

        ArrayAdapter<String>adaptergrid = new ArrayAdapter<>(this, R.layout.grid_textview,gridviewarry);
        gv.setAdapter(adaptergrid);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Toast.makeText(activity_grid_view.this, "MICROSOFT", Toast.LENGTH_SHORT).show();
                }
            }
        });


















    }//fun











}//class