package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class activity_currency_converter extends AppCompatActivity {

    TextView tv1,tv2;
    Spinner sp1,sp2;
    EditText et;

    ArrayList<String> spinnerarry = new ArrayList<>();
    private double[] exchange_Rate = {82.35, 88.79, 100.69, 109.28, 59.66, 54.78, 11.99, 1.00};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        tv1 = findViewById(R.id.header_title_currency_conv);
        tv2 = findViewById(R.id.edittext_textview_currency);
        sp1 = findViewById(R.id.currency_from);
        sp2 = findViewById(R.id.spinner_Show_currency);
        et  = findViewById(R.id.edittext_input_currency);

        //spinnerarry1

        spinnerarry.add("USD");
        spinnerarry.add("EUR");
        spinnerarry.add("GBP");
        spinnerarry.add("JPY");
        spinnerarry.add("CAD");
        spinnerarry.add("AUD");
        spinnerarry.add("CNY");
        spinnerarry.add("INR");

        ArrayAdapter<String> spinneradapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,spinnerarry);
        spinneradapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);



        sp1.setAdapter(spinneradapter);

        sp2.setAdapter(spinneradapter);


       sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int postion, long l) {

               if(postion)

           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });
























    }//fun





























}//class