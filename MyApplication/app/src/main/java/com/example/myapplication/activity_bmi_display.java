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

import org.w3c.dom.Text;

public class activity_bmi_display extends AppCompatActivity {

    Button btnback;
    TextView tv1,tv2,answer;
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_display);

        getSupportActionBar().hide();

        btnback = findViewById(R.id.back_btn2);
        tv1 = findViewById(R.id.bmi2);
        tv2 = findViewById(R.id.calculator_bmi2);
        img2 = findViewById(R.id.img_bmi2);
        answer = findViewById(R.id.answer_bmi2);



            Intent intent = getIntent();

            float bmi = intent.getFloatExtra("calculate_key",0);




            if (bmi < 18.5) {
                answer.setText("UNDERWEIGHT\n "+bmi);
            }
            else if (bmi < 25) {
                answer.setText("NORMAL\n "+bmi);
            }
            else if (bmi < 30){
                answer.setText("OVERWEIGHT\n "+bmi);
            }
            else {
                answer.setText("OBESE\n "+bmi);
            }


            btnback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent1 = new Intent(activity_bmi_display.this, activitybmi_calculator.class);
                    intent1.putExtra("back_value","") ;
                    startActivity(intent1);

                }
            });








    }//fun
}//class