package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class nykaa extends AppCompatActivity {


    private WebView nykaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nykaa);

        nykaa=(WebView) findViewById(R.id.nykaawebview);
        nykaa.setWebViewClient(new WebViewClient());
        nykaa.loadUrl("https://www.nykaa.com/");

        WebSettings webSettings = nykaa.getSettings();
        webSettings.setJavaScriptEnabled(true);
        nykaa.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        nykaa.getSettings().setAppCacheEnabled(true);
        nykaa.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(nykaa.canGoBack()){
            nykaa.goBack();
        }else {
            super.onBackPressed();
        }
    }
}