package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class zomato extends AppCompatActivity {

    private WebView zomato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zomato);

        zomato=(WebView) findViewById(R.id.zomatowebview);
        zomato.setWebViewClient(new WebViewClient());
        zomato.loadUrl("https://www.zomato.com/");

        WebSettings webSettings = zomato.getSettings();
        webSettings.setJavaScriptEnabled(true);
        zomato.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        zomato.getSettings().setAppCacheEnabled(true);
        zomato.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(zomato.canGoBack()){
            zomato.goBack();
        }else {
            super.onBackPressed();
        }
    }
}