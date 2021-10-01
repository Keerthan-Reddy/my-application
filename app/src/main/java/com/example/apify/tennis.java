package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class tennis extends AppCompatActivity {

    private WebView tennis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);

        tennis=(WebView) findViewById(R.id.tenniswebview);
        tennis.setWebViewClient(new WebViewClient());
        tennis.loadUrl("https://www.tennis.com/");

        WebSettings webSettings = tennis.getSettings();
        webSettings.setJavaScriptEnabled(true);
        tennis.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        tennis.getSettings().setAppCacheEnabled(true);
        tennis.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(tennis.canGoBack()){
            tennis.goBack();
        }else {
            super.onBackPressed();
        }
    }
}