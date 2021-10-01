package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ndtv extends AppCompatActivity {

    private WebView ndtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndtv);

        ndtv=(WebView) findViewById(R.id.ndtvwebview);
        ndtv.setWebViewClient(new WebViewClient());
        ndtv.loadUrl("https://www.ndtv.com/");

        WebSettings webSettings = ndtv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        ndtv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        ndtv.getSettings().setAppCacheEnabled(true);
        ndtv.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(ndtv.canGoBack()){
            ndtv.goBack();
        }else {
            super.onBackPressed();
        }
    }
}