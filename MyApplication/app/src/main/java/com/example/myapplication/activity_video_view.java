package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class activity_video_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        VideoView videoView = findViewById(R.id.video_view);

//        String vpath = "android.resource://"+getPackageName()+"/raw/google";

        String onlinepath = "https://www.mobifliks.info/series/Mr.Robot/Mr.Robot.S01E01.mp4";

//        Uri videoUri = Uri.parse();

          Uri onlinevideo = Uri.parse(onlinepath);

//        videoView.setVideoPath(vpath);

        videoView.setVideoURI(onlinevideo);

        MediaController mediaController = new MediaController(this);

        videoView.setMediaController(mediaController);

        mediaController.setAnchorView(videoView);

        videoView.start();


























    }//void




















}//class