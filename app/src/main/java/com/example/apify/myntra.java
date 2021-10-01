package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class myntra extends AppCompatActivity {


    private WebView myntra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myntra2);

        myntra=(WebView) findViewById(R.id.myntrawebview);
        myntra.setWebViewClient(new WebViewClient());
        myntra.loadUrl("https://www.myntra.com/");

        WebSettings webSettings = myntra.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myntra.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        myntra.getSettings().setAppCacheEnabled(true);
        myntra.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(myntra.canGoBack()){
            myntra.goBack();
        }else {
            super.onBackPressed();
        }
    }
}