package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class activity_whatsapp extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp);


        tab = findViewById(R.id.whatsapp_tabs);
        viewpager = findViewById(R.id.whatsapp_viewpager);

        ViewPagerWhatsappAdapter viewPagerWhatsappAdapter = new ViewPagerWhatsappAdapter(getSupportFragmentManager());
        viewpager.setAdapter(viewPagerWhatsappAdapter);

        tab.setupWithViewPager(viewpager);













    }//craete














}//class