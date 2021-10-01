package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class oyo extends AppCompatActivity {

    private WebView oyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyo);

        oyo=(WebView) findViewById(R.id.oyowebview);
        oyo.setWebViewClient(new WebViewClient());
        oyo.loadUrl("https://www.oyorooms.com/");

        WebSettings webSettings = oyo.getSettings();
        webSettings.setJavaScriptEnabled(true);
        oyo.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        oyo.getSettings().setAppCacheEnabled(true);
        oyo.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(oyo.canGoBack()){
            oyo.goBack();
        }else {
            super.onBackPressed();
        }
    }
}