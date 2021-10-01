package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Zeenews extends AppCompatActivity {


    private WebView Zeenews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeenews);

        Zeenews=(WebView) findViewById(R.id.zeenewswebview);
        Zeenews.setWebViewClient(new WebViewClient());
        Zeenews.loadUrl("https://zeenews.india.com/");

        WebSettings webSettings = Zeenews.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Zeenews.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        Zeenews.getSettings().setAppCacheEnabled(true);
        Zeenews.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(Zeenews.canGoBack()){
            Zeenews.goBack();
        }else {
            super.onBackPressed();
        }
    }
}