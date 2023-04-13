package com.example.myapplication;

import static java.net.Proxy.Type.HTTP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.HttpCookie;
import java.util.ArrayList;

public class activity_intent extends AppCompatActivity {

    Button msgbtn,msgbtn2,msgbtn3,dial,call,email,emailto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        msgbtn = findViewById(R.id.message_btn);
        msgbtn2 = findViewById(R.id.messageTO_btn);
        msgbtn3 = findViewById(R.id.messageMultiple_btn);
        dial = findViewById(R.id.dial_btn);
        call = findViewById(R.id.call_btn);
        email = findViewById(R.id.email_btn);
        emailto = findViewById(R.id.emailto_btn);

        msgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("smsto:" + Uri.encode("+916353854652")));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", "Hello,I'm Pc");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }

        });

        msgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
                intent.putExtra("sms_body", "HAPPY BIRTHDAY!!!");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


        msgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND_MULTIPLE);
                intent.setData(Uri.parse("smsto"));
                intent.putExtra(Intent.EXTRA_TEXT,"Hello..");
                intent.setType("text/plain");
                startActivity(intent);
            }
        });

        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "6353854682"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


            }
        });


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + "6353854682"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                String ary [] = {"abc@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, ary);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Programming");
                intent.putExtra(Intent.EXTRA_TEXT, "send to Hello I'm Parth Chaudhari ");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }



            }
        });

        emailto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL, "abc@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Programming");
                intent.putExtra(Intent.EXTRA_TEXT, "send Hello I'm Parth Chaudhari ");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


            }
        });




    }//voidcreate


}//class end