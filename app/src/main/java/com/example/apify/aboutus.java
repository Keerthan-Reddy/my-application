package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutus extends AppCompatActivity {

    private WebView aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        aboutus=(WebView) findViewById(R.id.aboutuswebview);
        aboutus.setWebViewClient(new WebViewClient());
        aboutus.loadUrl("https://www.amazon.in/");

        WebSettings webSettings = aboutus.getSettings();
        webSettings.setJavaScriptEnabled(true);
        aboutus.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        aboutus.getSettings().setAppCacheEnabled(true);
        aboutus.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(aboutus.canGoBack()){
            aboutus.goBack();
        }else {
            super.onBackPressed();
        }
    }
}