package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import pl.droidsonroids.gif.GifImageView;

public class activity_music_splash extends AppCompatActivity {

    GifImageView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_splash);

        getSupportActionBar().hide();

        gv = findViewById(R.id.splash_music_gif);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), activity_mymusic_player.class);
                startActivity(intent);
                finish();
            }
        }, 3000  );
















    }//fun


































}//class