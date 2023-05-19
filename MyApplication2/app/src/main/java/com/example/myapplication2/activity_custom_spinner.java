package com.example.myapplication2;

import static com.example.myapplication2.R.layout.spinner_selected_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class activity_custom_spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);


        String data[] = {"Java", "Python", "C++", "C", "Android", "JavaScript"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, spinner_selected_text, data);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown);

        Spinner spinner = findViewById(R.id.spinner);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(activity_custom_spinner.this, adapterView.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });






    }//oncreate
































}//class