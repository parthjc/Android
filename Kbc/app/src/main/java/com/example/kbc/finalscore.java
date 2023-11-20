package com.example.kbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalscore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalscore);

        // Get the intent that started this activity
        Intent intent = getIntent();

        // Check if the intent has extra data named "finalScore"
        if (intent.hasExtra("finalScore")) {
            // Retrieve the score from the intent
            int finalScore = intent.getIntExtra("finalScore", 0); // 0 is the default value if "finalScore" is not found

            // Display the score in a TextView or perform any other actions
            TextView scoreTextView = findViewById(R.id.finalScoreTextView); // replace with your TextView ID
            scoreTextView.setText("Your Final Score: " + finalScore);
        }




    }
}