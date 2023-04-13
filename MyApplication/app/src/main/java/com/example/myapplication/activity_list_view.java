package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_list_view extends AppCompatActivity {

    ListView lv;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        lv = findViewById(R.id.list_view);

        arrayList.add("Android 1.0");
        arrayList.add("Android 1.1 Petit Four");
        arrayList.add("Android Cupcake");
        arrayList.add("Android Donut");
        arrayList.add("Android Eclair");
        arrayList.add("Android Froyo");
        arrayList.add("Android Gingerbread");
        arrayList.add("Android Honeycomb");
        arrayList.add("Android Ice Cream Sandwich");
        arrayList.add("Android Jelly Bean");
        arrayList.add("Android KitKat");
        arrayList.add("Android Lollipop");
        arrayList.add("Android Marshmallow");
        arrayList.add("Android Nougat");
        arrayList.add("Android Oreo");
        arrayList.add("Android Pie");
        arrayList.add("Android 10");
        arrayList.add("Android 11");
        arrayList.add("Android 12");
        arrayList.add("Android 12L");
        arrayList.add("Android 13");
        arrayList.add("Android 14");
        arrayList.add("Android 15");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(activity_list_view.this, R.layout.activity_list_view_res ,arrayList);

        lv.setAdapter(arrayAdapter);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int choice, long l) {

                switch (choice){

                    case 0 :
                        Toast.makeText(activity_list_view.this, "Android 1.0 - September 23, 2008", Toast.LENGTH_SHORT).show();
                        break;

                    case 1 :
                        Toast.makeText(activity_list_view.this, "Android 1.1 Petit Four - February 9, 2009", Toast.LENGTH_SHORT).show();
                        break;

                    case 2 :
                        Toast.makeText(activity_list_view.this, "Android Cupcake - April 27, 2009", Toast.LENGTH_SHORT).show();
                        break;

                    case 3 :
                        Toast.makeText(activity_list_view.this, "Android Donut - September 15, 2009", Toast.LENGTH_SHORT).show();
                        break;

                    case 4 :
                        Toast.makeText(activity_list_view.this, "Android Eclair - December 3, 2009", Toast.LENGTH_SHORT).show();
                        break;

                    case 5 :
                        Toast.makeText(activity_list_view.this, "Android Froyo - May 20, 2010", Toast.LENGTH_SHORT).show();
                        break;

                    case 6 :
                        Toast.makeText(activity_list_view.this, "Android Gingerbread - December 6, 2010", Toast.LENGTH_SHORT).show();
                        break;

                    case 7 :
                        Toast.makeText(activity_list_view.this, "Android Honeycomb - February 22, 2011", Toast.LENGTH_SHORT).show();
                        break;

                    case 8 :
                        Toast.makeText(activity_list_view.this, "Android Ice Cream Sandwich - October 18, 2011", Toast.LENGTH_SHORT).show();
                        break;

                    case 9 :
                        Toast.makeText(activity_list_view.this, "Android Jelly Bean - July 9, 2012", Toast.LENGTH_SHORT).show();
                        break;

                    case 10 :
                        Toast.makeText(activity_list_view.this, "Android KitKat - October 31, 2013", Toast.LENGTH_SHORT).show();
                        break;

                    case 11 :
                        Toast.makeText(activity_list_view.this, "Android Lollipop - November 4, 2014", Toast.LENGTH_SHORT).show();
                        break;

                    case 12 :
                        Toast.makeText(activity_list_view.this, "Android Marshmallow - October 2, 2015", Toast.LENGTH_SHORT).show();
                        break;

                    case 13 :
                        Toast.makeText(activity_list_view.this, "Android Nougat - August 22, 2016", Toast.LENGTH_SHORT).show();
                        break;

                    case 14 :
                        Toast.makeText(activity_list_view.this, "Android Oreo - August 21, 2017", Toast.LENGTH_SHORT).show();
                        break;

                    case 15 :
                        Toast.makeText(activity_list_view.this, "Android Pie - August 6, 2018", Toast.LENGTH_SHORT).show();
                        break;

                    case 16 :
                        Toast.makeText(activity_list_view.this, "Android 10 - September 3, 2019", Toast.LENGTH_SHORT).show();
                        break;

                    case 17 :
                        Toast.makeText(activity_list_view.this, "Android 11 - September 8, 2020", Toast.LENGTH_SHORT).show();
                        break;

                    case 18 :
                        Toast.makeText(activity_list_view.this, "Android 12 - October 4, 2021", Toast.LENGTH_SHORT).show();
                        break;

                    case 19 :
                        Toast.makeText(activity_list_view.this, "Android 12L - March 7, 2022", Toast.LENGTH_SHORT).show();
                        break;

                    case 20 :
                        Toast.makeText(activity_list_view.this, "Android 13 - August 15, 2022", Toast.LENGTH_SHORT).show();
                        break;

                    case 21 :
                        Toast.makeText(activity_list_view.this, "Android 14 - March 8, 2023", Toast.LENGTH_SHORT).show();
                        break;

                    case 22 :
                        Toast.makeText(activity_list_view.this, "Android 15 - Q3 2024", Toast.LENGTH_SHORT).show();
                        break;









                }

            }
        });



























    }//fun

















































}//class