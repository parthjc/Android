package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class activity_alldatatype extends AppCompatActivity {

    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6,tv7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldatatype);

        tv = findViewById(R.id.java_datatype_tv);
        tv1 = findViewById(R.id.java_datatype_String);
        tv2 = findViewById(R.id.java_datatype_byte);
        tv3 = findViewById(R.id.java_datatype_int);
        tv4 = findViewById(R.id.java_datatype_float);
        tv5 = findViewById(R.id.java_datatype_double);
        tv6 = findViewById(R.id.java_datatype_long);
        tv7 = findViewById(R.id.java_datatype_boolean);

        Intent i = getIntent();

         String str = i.getStringExtra("str_type");
         byte byt = i.getByteExtra("byte_value" , (byte) 0);
         int nt = i.getIntExtra("int_value",0);
         float fl = i.getFloatExtra("float_value",0);
         double dl = i.getDoubleExtra("double_value",0);
         long lg =i.getLongExtra("long_value",0);
         boolean bl = i.getBooleanExtra("boolean_value",false);


         tv1.setText("String-> "+str);
         tv2.setText("byte-> "+byt);
         tv3.setText("int-> "+nt);
         tv4.setText("float-> "+fl);
         tv5.setText("double-> "+dl);
         tv6.setText("long-> "+lg);
         tv7.setText("boolean-> "+bl);







    }
}