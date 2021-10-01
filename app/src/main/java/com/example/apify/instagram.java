package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class instagram extends AppCompatActivity {

    private WebView instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        instagram = (WebView) findViewById(R.id.instagramweb);
        instagram.setWebViewClient(new WebViewClient());
        instagram.loadUrl("https://www.instagram.com/");


        WebSettings webSettings = instagram.getSettings();
        webSettings.setJavaScriptEnabled(true);
        instagram.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        instagram.getSettings().setAppCacheEnabled(true);
        instagram.getSettings().setDomStorageEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (instagram.canGoBack()) {
            instagram.goBack();
        } else {
            super.onBackPressed();
        }
    }
}