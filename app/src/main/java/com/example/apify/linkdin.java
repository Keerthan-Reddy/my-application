package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class linkdin extends AppCompatActivity {
    private WebView linkdin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkdin);

        linkdin = (WebView) findViewById(R.id.linkdinweb);
        linkdin.setWebViewClient(new WebViewClient());
        linkdin.loadUrl("https://www.linkedin.com/");


        WebSettings webSettings = linkdin.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        linkdin.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
//        linkdin.getSettings().setAppCacheEnabled(true);
//        linkdin.getSettings().setDomStorageEnabled(true);

    }


    @Override
    public void onBackPressed() {
        if (linkdin.canGoBack()) {
            linkdin.goBack();
        } else {
            super.onBackPressed();
        }
    }
}