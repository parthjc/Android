package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_tic_tac_toe extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String sbtn1,sbtn2,sbtn3,sbtn4,sbtn5,sbtn6,sbtn7,sbtn8,sbtn9;
    int count =  0;
    int flag  =  0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        initValue();


    }//fun


    private void initValue() {

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9= findViewById(R.id.btn9);
        tv= findViewById(R.id.tvtic);

    }

    public void checkresult(View view) {

        Button btnview = (Button) view;

        count++;

        if(btnview.getText().toString().equals("")){

            if(flag == 0){
                btnview.setText("X");
                flag++;
            }else {
                btnview.setText("0");
                flag--;
            }

            if(count > 4){

                sbtn1 = btn1.getText().toString();
                sbtn2 = btn2.getText().toString();
                sbtn3 = btn3.getText().toString();
                sbtn4 = btn4.getText().toString();
                sbtn5 = btn5.getText().toString();
                sbtn6 = btn6.getText().toString();
                sbtn7 = btn7.getText().toString();
                sbtn8 = btn8.getText().toString();
                sbtn9 = btn9.getText().toString();

                if (sbtn1.equals(sbtn2) && sbtn2.equals(sbtn3) && !sbtn1.equals("")){
                    Toast.makeText(this, "WINNER-> " + sbtn1, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn1);
                    delaygame();
                }
                else if (sbtn4.equals(sbtn5) && sbtn5.equals(sbtn6) && !sbtn4.equals("")){
                    Toast.makeText(this, "WINNER-> " + sbtn4, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn4);
                    delaygame();
                }
                else if (sbtn7.equals(sbtn8) && sbtn8.equals(sbtn9) && !sbtn7.equals("")){
                    Toast.makeText(this, "WINNER->" + sbtn7, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn7);
                    delaygame();
                }
                else if (sbtn1.equals(sbtn5) && sbtn5.equals(sbtn9) && !sbtn1.equals("")){
                    Toast.makeText(this, "WINNER-> " + sbtn1, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn1);
                    delaygame();
                }
                else if (sbtn3.equals(sbtn5) && sbtn5.equals(sbtn7) && !sbtn3.equals("")){
                    Toast.makeText(this, "WINNER-> " + sbtn3, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn5);
                    delaygame();
                }
                else if (sbtn1.equals(sbtn4) && sbtn4.equals(sbtn7) && !sbtn1.equals("")){
                    Toast.makeText(this, "WINNER-> " + sbtn1, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn7);
                    delaygame();
                }
                else if (sbtn2.equals(sbtn5) && sbtn5.equals(sbtn8) && !sbtn2.equals("")){
                    Toast.makeText(this, "WINNER-> " + sbtn2, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn2);
                    delaygame();
                }
                else if (sbtn3.equals(sbtn6) && sbtn6.equals(sbtn9) && !sbtn3.equals("")){
                    Toast.makeText(this, "WINNER-> " + sbtn3, Toast.LENGTH_LONG).show();
                    tv.setText("WINNER-> " + sbtn3);
                    delaygame();
                }
                else if(count >= 9){
                    Toast.makeText(this, "Tie.....", Toast.LENGTH_SHORT).show();
                    tv.setText("...TIE...");
                    delaygame();
                }











            }//ifc





        }//ifbtn

    }//check fun

    private void restartganme() {

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        tv.setText("");

        count =  0;
        flag  =  0;
    }

    private void delaygame(){

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                restartganme();
            }
        },6000);


    }


}//class