package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activitybmi_calculator extends AppCompatActivity {

    Button btncal;
    TextView tv1,tv2;
    ImageView img;
    EditText edit1,edit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitybmi_calculator);

        getSupportActionBar().hide();


        btncal = findViewById(R.id.calculatebmi_btn);
        tv1 = findViewById(R.id.bmi);
        tv2 = findViewById(R.id.calculator_bmi);
        img = findViewById(R.id.img_bmi);
        edit1 = findViewById(R.id.weight_bmi);
        edit2 = findViewById(R.id.height_bmi);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edit1.getText().toString().length() > 0 && edit2.getText().toString().length() > 0){

                    float height = Float.parseFloat(edit1.getText().toString());
                    float weight = Float.parseFloat(edit2.getText().toString());
                    float calculate = weight/(height / 100 * height / 100);

                    Intent intent = new Intent(activitybmi_calculator.this , activity_bmi_display.class);

                    intent.putExtra("calculate_key",calculate);

                    startActivity(intent);



                }else {
                    Toast.makeText(activitybmi_calculator.this, "INVALID ARGUMENT!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        Intent intent2 = getIntent();

        intent2.putExtra("back_value","");



    }//fun
}//class