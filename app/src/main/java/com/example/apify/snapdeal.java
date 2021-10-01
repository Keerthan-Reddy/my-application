package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class snapdeal extends AppCompatActivity {


    private WebView snapdeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapdeal);

        snapdeal=(WebView) findViewById(R.id.snapdealwebview);
        snapdeal.setWebViewClient(new WebViewClient());
        snapdeal.loadUrl("https://www.snapdeal.com/");

        WebSettings webSettings = snapdeal.getSettings();
        webSettings.setJavaScriptEnabled(true);
        snapdeal.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        snapdeal.getSettings().setAppCacheEnabled(true);
        snapdeal.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(snapdeal.canGoBack()){
            snapdeal.goBack();
        }else {
            super.onBackPressed();
        }
    }
}