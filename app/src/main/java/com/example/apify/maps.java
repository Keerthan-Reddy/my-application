package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class maps extends AppCompatActivity {

    private WebView maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        maps=(WebView) findViewById(R.id.mapswebview);
        maps.setWebViewClient(new WebViewClient());
        maps.loadUrl("https://www.google.com/maps/");

        WebSettings webSettings = maps.getSettings();
        webSettings.setJavaScriptEnabled(true);
        maps.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        maps.getSettings().setAppCacheEnabled(true);
        maps.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(maps.canGoBack()){
            maps.goBack();
        }else {
            super.onBackPressed();
        }
    }
}