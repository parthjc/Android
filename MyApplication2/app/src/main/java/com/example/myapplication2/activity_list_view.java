package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class activity_list_view extends AppCompatActivity {

    ListView lv;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv = findViewById(R.id.music_list);

        arrayList.add("Om Namah Shivay");
        arrayList.add("Jai Hanuman ");
        arrayList.add("Jai Mata Di ");
        arrayList.add("Shri Ganeshay Namah");
        arrayList.add("Jai Shri Krishna");
        arrayList.add("Ram Bhajans");
        arrayList.add("Ram siya ram");
        arrayList.add("Bola Har Har Har");
        arrayList.add("Shri krishna govind hare murari");
        arrayList.add("Namo Namo");
        arrayList.add("Main balak tu mata");
        arrayList.add("Bhagwan hai kahan re tu");
        arrayList.add("Mere Sar Pe Sada Tera Hath Rahe");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.text_view_music,arrayList);

        lv.setAdapter(arrayAdapter);
















    }//fun








































}//class