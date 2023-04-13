package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class activity_auto_complete_text extends AppCompatActivity {

    AutoCompleteTextView atv;

    ArrayList<String> autotextArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        atv = findViewById(R.id.auto_complete_text);

        autotextArrayList.add("India");
        autotextArrayList.add("Uk");
        autotextArrayList.add("Us");
        autotextArrayList.add("Iceland");
        autotextArrayList.add("Indonesia");
        autotextArrayList.add("Iran");
        autotextArrayList.add("Uzbekistan");
        autotextArrayList.add("Ukraine");
        autotextArrayList.add("Uganda");
        autotextArrayList.add("Afghanistan");
        autotextArrayList.add("Albania");
        autotextArrayList.add("Andorra");
        autotextArrayList.add("Argentina");


        ArrayAdapter<String> autotextArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,autotextArrayList);

        atv.setAdapter(autotextArrayAdapter);

        atv.setThreshold(1);



































    }//fun













































}//class