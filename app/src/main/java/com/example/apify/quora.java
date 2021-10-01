package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class quora extends AppCompatActivity {

    private WebView quora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quora2);

        quora = (WebView) findViewById(R.id.quoraweb);
        quora.setWebViewClient(new WebViewClient());
        quora.loadUrl("https://www.quora.com/");


        WebSettings webSettings = quora.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        quora.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
//        quora.getSettings().setAppCacheEnabled(true);
//        quora.getSettings().setDomStorageEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (quora.canGoBack()) {
            quora.goBack();
        } else {
            super.onBackPressed();
        }
    }
}