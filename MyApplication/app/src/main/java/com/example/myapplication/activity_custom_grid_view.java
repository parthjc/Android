package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class activity_custom_grid_view extends AppCompatActivity {

    GridView gd;

    int icon[] = {

            R.drawable.windows,
            R.drawable.apple,
            R.drawable.linux,
            R.drawable.ubuntu,
            R.drawable.debian_file,
            R.drawable.ms_dos,
            R.drawable.solaris,
            R.drawable.fedora,
            R.drawable.windows_vista,
            R.drawable.windows_nt,
            R.drawable.kali_linux,
            R.drawable.android,


    };

    String name[] = {"Windows","Mac","Linux","Ubuntu","Desbian","MS-DOS","Solaris","Fedora","Windows Vista","Windows NT","Kali Linux","Android"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);

        gd = findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter(name,icon,this);
        gd.setAdapter(gridAdapter);













    }//fun














































}//class