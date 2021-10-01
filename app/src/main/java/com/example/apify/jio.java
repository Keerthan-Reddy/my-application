package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class jio extends AppCompatActivity {

    private WebView jio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jio);

        jio=(WebView) findViewById(R.id.jiowebview);
        jio.setWebViewClient(new WebViewClient());
        jio.loadUrl("https://www.jio.com/selfcare/recharge/mobility/");

        WebSettings webSettings = jio.getSettings();
        webSettings.setJavaScriptEnabled(true);
        jio.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        jio.getSettings().setAppCacheEnabled(true);
        jio.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(jio.canGoBack()){
            jio.goBack();
        }else {
            super.onBackPressed();
        }
    }
}