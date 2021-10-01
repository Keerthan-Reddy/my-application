package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class swiggy extends AppCompatActivity {

    private WebView swiggy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy);

        swiggy=(WebView) findViewById(R.id.swiggyweb);
        swiggy.setWebViewClient(new WebViewClient());
        swiggy.loadUrl("https://www.swiggy.com/");

        WebSettings webSettings = swiggy.getSettings();
        webSettings.setJavaScriptEnabled(true);
        swiggy.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        swiggy.getSettings().setAppCacheEnabled(true);
        swiggy.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(swiggy.canGoBack()){
            swiggy.goBack();
        }else {
            super.onBackPressed();
        }
    }
}