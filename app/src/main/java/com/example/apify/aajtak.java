package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aajtak extends AppCompatActivity {


    private WebView aajtak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aajtak);

        aajtak=(WebView) findViewById(R.id.aajtakwebview);
        aajtak.setWebViewClient(new WebViewClient());
        aajtak.loadUrl("https://www.aajtak.in/");

        WebSettings webSettings = aajtak.getSettings();
        webSettings.setJavaScriptEnabled(true);
        aajtak.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        aajtak.getSettings().setAppCacheEnabled(true);
        aajtak.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(aajtak.canGoBack()){
            aajtak.goBack();
        }else {
            super.onBackPressed();
        }
    }
}