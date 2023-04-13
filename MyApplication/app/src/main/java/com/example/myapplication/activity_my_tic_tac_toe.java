package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_my_tic_tac_toe extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String strbtn1,strbtn2,strbtn3,strbtn4,strbtn5,strbtn6,strbtn7,strbtn8,strbtn9;
    int flag  = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tic_tac_toe);

        btninit();

    }//oncreate

    private void btninit() {

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

    }//btninit


    public void gamelogic(View view) {

        Button allbtn = (Button) view;
        count ++;

        if(allbtn.getText().toString().equals("")){

            if (flag == 0){
                allbtn.setText("X");
                flag ++;
            }else {
                allbtn.setText("0");
                flag--;
            }

            if (count > 4){

                strbtn1 = btn1.getText().toString();
                strbtn2 = btn2.getText().toString();
                strbtn3 = btn3.getText().toString();
                strbtn4 = btn4.getText().toString();
                strbtn5 = btn5.getText().toString();
                strbtn6 = btn6.getText().toString();
                strbtn7 = btn7.getText().toString();
                strbtn8 = btn8.getText().toString();
                strbtn9 = btn9.getText().toString();

                if(strbtn1.equals(strbtn2) && strbtn2.equals(strbtn3) && !strbtn1.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn1, Toast.LENGTH_LONG).show();
                }else if(strbtn4.equals(strbtn5) && strbtn5.equals(strbtn6) && !strbtn4.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn4, Toast.LENGTH_LONG).show();
                }else if(strbtn7.equals(strbtn8) && strbtn8.equals(strbtn9) && !strbtn7.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn7, Toast.LENGTH_LONG).show();
                }else if(strbtn1.equals(strbtn4) && strbtn4.equals(strbtn7) && !strbtn1.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn1, Toast.LENGTH_LONG).show();
                }else if(strbtn2.equals(strbtn5) && strbtn5.equals(strbtn6) && !strbtn2.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn2, Toast.LENGTH_LONG).show();
                }else if(strbtn3.equals(strbtn6) && strbtn6.equals(strbtn9) && !strbtn3.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn3, Toast.LENGTH_LONG).show();
                }else if(strbtn1.equals(strbtn5) && strbtn5.equals(strbtn9) && !strbtn1.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn1, Toast.LENGTH_LONG).show();
                }else if(strbtn3.equals(strbtn5) && strbtn5.equals(strbtn7) && !strbtn3.equals("")){
                    Toast.makeText(this, "WINNER-> " + strbtn3, Toast.LENGTH_LONG).show();
                }else if(count >= 9 ){
                    Toast.makeText(this, "<--TIE--> " + strbtn1, Toast.LENGTH_SHORT).show();
                    delaygame();
                }




            }//btn count

        }//if allbtn

    }//gamelogic

    private void delaygame() {

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        count = 0;
        flag  = 0;

    }


}//class