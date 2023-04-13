package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class activity_alert_btn extends AppCompatActivity {

    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_btn);

        ib = findViewById(R.id.alert_del_btn);


        AlertDialog.Builder aBuilder = new AlertDialog.Builder(this);

        aBuilder.setTitle("Delete");
        aBuilder.setIcon(R.drawable.ic_baseline_delete_24);
        aBuilder.setMessage("Are you sure want to delete!");

        aBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(activity_alert_btn.this, "Item Delete", Toast.LENGTH_SHORT).show();
            }
        });

        aBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(activity_alert_btn.this, "Item Not Delete", Toast.LENGTH_SHORT).show();
            }
        });



        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aBuilder.show();

            }
        });





















    }//fun
}//class