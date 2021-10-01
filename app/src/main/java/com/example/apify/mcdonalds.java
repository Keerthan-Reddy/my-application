package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mcdonalds extends AppCompatActivity {

    private WebView mcdonalds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcdonalds);

        mcdonalds=(WebView) findViewById(R.id.mcdonaldswebview);
        mcdonalds.setWebViewClient(new WebViewClient());
        mcdonalds.loadUrl("https://www.mcdelivery.co.in/");

        WebSettings webSettings = mcdonalds.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mcdonalds.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        mcdonalds.getSettings().setAppCacheEnabled(true);
        mcdonalds.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(mcdonalds.canGoBack()){
            mcdonalds.goBack();
        }else {
            super.onBackPressed();
        }
    }
}