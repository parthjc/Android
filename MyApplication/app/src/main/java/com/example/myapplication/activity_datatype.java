package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_datatype extends AppCompatActivity {

    TextView iv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datatype);

        iv = findViewById(R.id.java_iv);
        btn = findViewById(R.id.btn_click);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_datatype.this ,activity_alldatatype.class);

                String str = "String_Type";
                byte byt = 111;
                int nt = 1121214;
                float fl = 101.00f;
                double dl = 102121.11111;
                long lg = 1111121454444l;
                boolean bl = true;

                i.putExtra("str_type",str);
                i.putExtra("byte_value", byt);
                i.putExtra("int_value", nt);
                i.putExtra("float_value", fl);
                i.putExtra("double_value", dl);
                i.putExtra("long_value", lg);
                i.putExtra("boolean_value", bl);

                startActivity(i);


            }
        });


    }
}