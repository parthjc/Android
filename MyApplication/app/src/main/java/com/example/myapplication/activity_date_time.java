package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class activity_date_time extends AppCompatActivity {

    TextView tvdt,tvtime;
    AppCompatButton btndt,btntime;
    int date,month,year,hour,minute,second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

        tvdt = findViewById(R.id.tv_date);
        btndt = findViewById(R.id.btn_date);
        tvtime = findViewById(R.id.tv_time);
        btntime = findViewById(R.id.btn_time);


        Calendar calendar = Calendar.getInstance();

        date = calendar.get(Calendar.DATE);
        month = calendar.get(Calendar.MONTH);
        year = calendar.get(Calendar.YEAR);

        hour = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);

        btndt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(activity_date_time.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {

                        tvdt.setText(date + "/" + (month+1) + "/" + year);


                    }
                }, year, month, date);

                    datePickerDialog.show();
            }



        });


        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(activity_date_time.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {

                        tvtime.setText(hour +":"+ minute );

                    }
                },hour,minute,true);
                    timePickerDialog.show();
            }
        });









    }//oncreate


































}//class