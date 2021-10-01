package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class paytmrecharge extends AppCompatActivity {


    private WebView paytmrecharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paytmrecharge);

        paytmrecharge=(WebView) findViewById(R.id.paytmrechargewebview);
        paytmrecharge.setWebViewClient(new WebViewClient());
        paytmrecharge.loadUrl("https://paytm.com/");

        WebSettings webSettings = paytmrecharge.getSettings();
        webSettings.setJavaScriptEnabled(true);
        paytmrecharge.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        paytmrecharge.getSettings().setAppCacheEnabled(true);
        paytmrecharge.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(paytmrecharge.canGoBack()){
            paytmrecharge.goBack();
        }else {
            super.onBackPressed();
        }
    }
}