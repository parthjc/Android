package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_life_cycle extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("first step","onCreate()..");
        Log.d("create","oneCreate()");
        Toast.makeText(this, "oneCreate", Toast.LENGTH_SHORT).show();

        btn = findViewById(R.id.android_life_cycle_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),activity_life_cycle2.class);
               // intent.putExtra("next_intent","");
                startActivity(intent);
            }
        });

        Intent intent = getIntent();





    }//fun()


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("second step","onStrat()..");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("third step","onResume()..");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fourth step","onRestart");
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("five step","onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("six step","onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("seven step","onDestory");
        Toast.makeText(this, "onDestory", Toast.LENGTH_SHORT).show();
    }
}//class