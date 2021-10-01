package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class facebook extends AppCompatActivity {

    private WebView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        facebook = (WebView) findViewById(R.id.facebookweb);
        facebook.setWebViewClient(new WebViewClient());
        facebook.loadUrl("https://www.facebook.com/");


        WebSettings webSettings = facebook.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        facebook.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
//        facebook.getSettings().setAppCacheEnabled(true);
//        facebook.getSettings().setDomStorageEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (facebook.canGoBack()) {
            facebook.goBack();
        } else {
            super.onBackPressed();
        }
    }
}