package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class youtube1 extends AppCompatActivity {

    private WebView youtube1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube1);

        youtube1 = (WebView) findViewById(R.id.youtubeweb);
        youtube1.setWebViewClient(new WebViewClient());
        youtube1.loadUrl("https://www.youtube.com/");


        WebSettings webSettings = youtube1.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        youtube1.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
//        youtube1.getSettings().setAppCacheEnabled(true);
//        youtube1.getSettings().setDomStorageEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (youtube1.canGoBack()) {
            youtube1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}