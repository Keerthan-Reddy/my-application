package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class netflix extends AppCompatActivity {

    private WebView netflix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netflix);

        netflix=(WebView) findViewById(R.id.netflixweb);
        netflix.setWebViewClient(new WebViewClient());
        netflix.loadUrl("https://www.netflix.com/in/");

        WebSettings webSettings = netflix.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(netflix.canGoBack()){
            netflix.goBack();
        }else {
            super.onBackPressed();
        }
    }
}