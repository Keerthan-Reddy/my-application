package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class flipkart extends AppCompatActivity {


    private WebView flipkart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipkart);

        flipkart=(WebView) findViewById(R.id.flipkartwebview);
        flipkart.setWebViewClient(new WebViewClient());
        flipkart.loadUrl("https://www.flipkart.com/");

        WebSettings webSettings = flipkart.getSettings();
        webSettings.setJavaScriptEnabled(true);
        flipkart.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        flipkart.getSettings().setAppCacheEnabled(true);
        flipkart.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(flipkart.canGoBack()){
            flipkart.goBack();
        }else {
            super.onBackPressed();
        }
    }
}