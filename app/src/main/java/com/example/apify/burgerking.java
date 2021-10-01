package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class burgerking extends AppCompatActivity {

    private WebView burgerking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgerking);

        burgerking=(WebView) findViewById(R.id.burgerkingwebview);
        burgerking.setWebViewClient(new WebViewClient());
        burgerking.loadUrl("https://www.burgerking.in/");

        WebSettings webSettings = burgerking.getSettings();
        webSettings.setJavaScriptEnabled(true);
        burgerking.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        burgerking.getSettings().setAppCacheEnabled(true);
        burgerking.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(burgerking.canGoBack()){
            burgerking.goBack();
        }else {
            super.onBackPressed();
        }
    }
}