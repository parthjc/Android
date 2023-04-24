package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class activity_alertbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertbox);


        AlertDialog alertD  = new AlertDialog.Builder(this).create();

        alertD.setTitle("Terms & Conditions");
        alertD.setIcon(R.drawable.ic_baseline_info_24);
        alertD.setMessage("Have You Read All T & C");

        alertD.setButton(-1, "Yes I have Read", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                Toast.makeText(activity_alertbox.this, "Yes You Can Login Now!", Toast.LENGTH_SHORT).show();
            }
        });

        alertD.show();


        AlertDialog.Builder alBuilder = new AlertDialog.Builder(this);

        alBuilder.setTitle("Delete");
        alBuilder.setIcon(R.drawable.ic_baseline_delete_24);
        alBuilder.setMessage("Are You Sure Want To Delete!");

        alBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(activity_alertbox.this, "Item Delete", Toast.LENGTH_SHORT).show();
            }
        });

        alBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(activity_alertbox.this, "Item Not Delete", Toast.LENGTH_SHORT).show();
            }
        });

        alBuilder.show();























    }//fun

    @Override
    public void onBackPressed() {

        AlertDialog.Builder exitBuilder = new AlertDialog.Builder(this);

        exitBuilder.setTitle("Exit");
        exitBuilder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        exitBuilder.setMessage("Are You Sure Want To Exit!");

        exitBuilder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(activity_alertbox.this, "Welcome Back", Toast.LENGTH_SHORT).show();
            }
        });

        exitBuilder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                activity_alertbox.super.onBackPressed();
            }
        });

        exitBuilder.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(activity_alertbox.this, "Operation Cancle", Toast.LENGTH_SHORT).show();
            }
        });

        exitBuilder.show();
    }








}//class