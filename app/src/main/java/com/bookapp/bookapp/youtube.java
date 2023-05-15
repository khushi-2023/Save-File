package com.bookapp.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class youtube extends AppCompatActivity {
    ImageButton imgbtn, imgback;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        imgbtn=findViewById(R.id.logoutBtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(youtube.this,wach.class));
            }
        });
        imgback=findViewById(R.id.backBtn);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(youtube.this,wach.class));
            }
        });

        mWebView=findViewById(R.id.web);

        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://www.google.com/intl/en_in/earth/");
        WebSettings webSettings= mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}

