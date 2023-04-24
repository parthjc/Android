package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class activity_webview extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.webview1);

        webView.loadUrl("https://www.google.com/");
        //webView.setWebViewClient(new WebViewClient());

       // webView.loadUrl("https://www.flipkart.com/");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        //webView.setWebViewClient((new WebViewClient()));

        webView.setWebViewClient(new Webclass());






    }//create


    public void exitwebview(){

        AlertDialog.Builder aBuilder = new AlertDialog.Builder(this);

        aBuilder.setTitle("Exit");
        aBuilder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        aBuilder.setMessage("Are You Sure Want To Exit?");


        aBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                activity_webview.super.onBackPressed();
            }
        });

        aBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        aBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(activity_webview.this, "Cancel", Toast.LENGTH_SHORT).show();
            }
        });

        aBuilder.show();


    }


    @Override
    public void onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack();
        }else {
            //super.onBackPressed();
            //finish();
            exitwebview();

        }

    }


    private class Webclass extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);

            return  true;

            //return super.shouldOverrideUrlLoading(view, url);
        }
    }
}//class