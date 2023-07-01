package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class activity_bottomlyout extends AppCompatActivity {

    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomlyout);

        bnView = findViewById(R.id.bottom_nav);

        bnView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id==R.id.nav_home)
                {
                    onLoad(new fragment_home(),true);
                }else if(id==R.id.nav_search)
                {
                    onLoad(new fragment_search() , false);
                }else if(id==R.id.nav_add){

                    onLoad(new fragment_add() , false);
                }else if(id==R.id.nav_Reels){

                    onLoad(new fragment_reels() , false);
                }else if(id==R.id.nav_profile)
                {
                    onLoad(new fragment_profile() , false);
                }else{
                    onLoad(new fragment_home() , false);
                }
                return true;
            }
        });
        bnView.setSelectedItemId(R.id.nav_home);


    }//oncreate


    private void onLoad(Fragment fragment, Boolean flag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(flag)
        {
            fragmentTransaction.add(R.id.frame_layout1,fragment);
        }else{
            fragmentTransaction.replace(R.id.frame_layout1,fragment);
        }

        fragmentTransaction.commit();
    }
































}//class