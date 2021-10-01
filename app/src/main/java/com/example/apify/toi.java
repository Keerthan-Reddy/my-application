package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class toi extends AppCompatActivity {


    private WebView toi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi);

        toi=(WebView) findViewById(R.id.toiwebview);
        toi.setWebViewClient(new WebViewClient());
        toi.loadUrl("https://timesofindia.indiatimes.com/");

        WebSettings webSettings = toi.getSettings();
        webSettings.setJavaScriptEnabled(true);
        toi.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        toi.getSettings().setAppCacheEnabled(true);
        toi.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(toi.canGoBack()){
            toi.goBack();
        }else {
            super.onBackPressed();
        }
    }
}