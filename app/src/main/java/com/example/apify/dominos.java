package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dominos extends AppCompatActivity {

    private WebView dominos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dominos);

        dominos=(WebView) findViewById(R.id.dominoswebview);
        dominos.setWebViewClient(new WebViewClient());
        dominos.loadUrl("https://www.dominos.co.in/");

        WebSettings webSettings = dominos.getSettings();
        webSettings.setJavaScriptEnabled(true);
        dominos.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        dominos.getSettings().setAppCacheEnabled(true);
        dominos.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(dominos.canGoBack()){
            dominos.goBack();
        }else {
            super.onBackPressed();
        }
    }
}