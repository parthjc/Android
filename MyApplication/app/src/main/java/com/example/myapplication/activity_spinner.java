package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_spinner extends AppCompatActivity  {

    Spinner sp;
    TextView tv;
    ArrayList<String> spinnerArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp = findViewById(R.id.spinner);
        tv = findViewById(R.id.tv_spinner);

        spinnerArrayList.add("Aadhar Card");
        spinnerArrayList.add("Voter ID Card");
        spinnerArrayList.add("Pan Card");
        spinnerArrayList.add("Driving License");
        spinnerArrayList.add("Ration Card");
        spinnerArrayList.add("Passport ");


        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(activity_spinner.this, android.R.layout.simple_list_item_1,spinnerArrayList) {

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                TextView tvdata = (TextView) super.getDropDownView(position,convertView,parent);


                if (position==0){
                    tvdata.setTextColor(Color.RED);
                }



                return tvdata;
            }
        };

        sp.setAdapter(spinnerArrayAdapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String value = spinnerArrayAdapter.getItem(position).toString();

                tv.setText(value);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

















































    }//fun



}//class