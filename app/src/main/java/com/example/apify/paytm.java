package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class paytm extends AppCompatActivity {


    private WebView paytm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paytm);

        paytm=(WebView) findViewById(R.id.paytmwebview);
        paytm.setWebViewClient(new WebViewClient());
        paytm.loadUrl("https://paytmmall.com/");

       WebSettings webSettings = paytm.getSettings();
       webSettings.setJavaScriptEnabled(true);
        paytm.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        paytm.getSettings().setAppCacheEnabled(true);
        paytm.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(paytm.canGoBack()){
            paytm.goBack();
        }else {
            super.onBackPressed();
        }
    }
}