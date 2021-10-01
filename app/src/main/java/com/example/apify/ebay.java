package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ebay extends AppCompatActivity {


    private WebView ebay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebay);

        ebay=(WebView) findViewById(R.id.ebaywebview);
        ebay.setWebViewClient(new WebViewClient());
        ebay.loadUrl("https://www.ebay.com/");

        WebSettings webSettings = ebay.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        ebay.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
//        ebay.getSettings().setAppCacheEnabled(true);
//        ebay.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(ebay.canGoBack()){
            ebay.goBack();
        }else {
            super.onBackPressed();
        }
    }
}