package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class kfc extends AppCompatActivity {

    private WebView kfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);

        kfc=(WebView) findViewById(R.id.kfcwebview);
        kfc.setWebViewClient(new WebViewClient());
        kfc.loadUrl("https://online.kfc.co.in/");

        WebSettings webSettings = kfc.getSettings();
        webSettings.setJavaScriptEnabled(true);
        kfc.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        kfc.getSettings().setAppCacheEnabled(true);
        kfc.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(kfc.canGoBack()){
            kfc.goBack();
        }else {
            super.onBackPressed();
        }
    }
}