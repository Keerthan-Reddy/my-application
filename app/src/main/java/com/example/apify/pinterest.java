package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pinterest extends AppCompatActivity {
    private WebView pinterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinterest);

        pinterest = (WebView) findViewById(R.id.pinterestweb);
        pinterest.setWebViewClient(new WebViewClient());
        pinterest.loadUrl("https://in.pinterest.com/");


        WebSettings webSettings = pinterest.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        pinterest.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
//        pinterest.getSettings().setAppCacheEnabled(true);
//        pinterest.getSettings().setDomStorageEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (pinterest.canGoBack()) {
            pinterest.goBack();
        } else {
            super.onBackPressed();
        }
    }
}