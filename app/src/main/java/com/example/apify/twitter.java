package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class twitter extends AppCompatActivity {

    private WebView twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        twitter = (WebView) findViewById(R.id.twitterweb);
        twitter.setWebViewClient(new WebViewClient());
        twitter.loadUrl("https://twitter.com/");


        WebSettings webSettings = twitter.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        twitter.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
//        twitter.getSettings().setAppCacheEnabled(true);
//        twitter.getSettings().setDomStorageEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (twitter.canGoBack()) {
            twitter.goBack();
        } else {
            super.onBackPressed();
        }
    }
}