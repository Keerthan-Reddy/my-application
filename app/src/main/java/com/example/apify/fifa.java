package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fifa extends AppCompatActivity {

    private WebView fifa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifa);

        fifa=(WebView) findViewById(R.id.fifawebview);
        fifa.setWebViewClient(new WebViewClient());
        fifa.loadUrl("https://www.fifa.com/");

        WebSettings webSettings = fifa.getSettings();
        webSettings.setJavaScriptEnabled(true);
        fifa.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        fifa.getSettings().setAppCacheEnabled(true);
        fifa.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(fifa.canGoBack()){
            fifa.goBack();
        }else {
            super.onBackPressed();
        }
    }
}