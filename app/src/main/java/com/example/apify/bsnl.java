package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bsnl extends AppCompatActivity {

    private WebView bsnl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsnl);

        bsnl=(WebView) findViewById(R.id.bsnlwebview);
        bsnl.setWebViewClient(new WebViewClient());
        bsnl.loadUrl("https://portal.bsnl.in/myportal/quickrecharge.do");

        WebSettings webSettings = bsnl.getSettings();
        webSettings.setJavaScriptEnabled(true);
        bsnl.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        bsnl.getSettings().setAppCacheEnabled(true);
        bsnl.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(bsnl.canGoBack()){
            bsnl.goBack();
        }else {
            super.onBackPressed();
        }
    }
}