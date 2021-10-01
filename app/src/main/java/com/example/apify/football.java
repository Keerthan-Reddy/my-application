package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class football extends AppCompatActivity {

    private WebView football;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        football=(WebView) findViewById(R.id.footballwebview);
        football.setWebViewClient(new WebViewClient());
        football.loadUrl("https://www.football.com/");

        WebSettings webSettings = football.getSettings();
        webSettings.setJavaScriptEnabled(true);
        football.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        football.getSettings().setAppCacheEnabled(true);
        football.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(football.canGoBack()){
            football.goBack();
        }else {
            super.onBackPressed();
        }
    }
}