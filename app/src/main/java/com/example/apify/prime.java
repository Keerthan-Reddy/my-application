package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class prime extends AppCompatActivity {

    private WebView prime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);

        prime=(WebView) findViewById(R.id.primeweb);
        prime.setWebViewClient(new WebViewClient());
        prime.loadUrl("https://www.primevideo.com/");

        WebSettings webSettings = prime.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(prime.canGoBack()){
            prime.goBack();
        }else {
            super.onBackPressed();
        }
    }
}