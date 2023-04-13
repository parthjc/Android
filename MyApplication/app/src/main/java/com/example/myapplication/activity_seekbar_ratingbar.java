package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class activity_seekbar_ratingbar extends AppCompatActivity {

    SeekBar sb;
    RatingBar rb;
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar_ratingbar);

        sb = findViewById(R.id.sbar);
        rb = findViewById(R.id.ratng);
        tv1 = findViewById(R.id.tv_ram);
        tv2 = findViewById(R.id.tv_shiva);
        tv3 = findViewById(R.id.hotel);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv1.setText(String.valueOf(progress));
                tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP, progress);
                Toast.makeText(activity_seekbar_ratingbar.this, "progress", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(activity_seekbar_ratingbar.this, "start", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(activity_seekbar_ratingbar.this, "stop", Toast.LENGTH_SHORT).show();
            }
        });



        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv3.setText(String.valueOf(rating));
            }
        });























































    }//fun





}//class

