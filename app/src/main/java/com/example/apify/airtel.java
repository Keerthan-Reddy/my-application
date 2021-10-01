package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class airtel extends AppCompatActivity {

    private WebView airtel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtel);

        airtel=(WebView) findViewById(R.id.airtelwebview);
        airtel.setWebViewClient(new WebViewClient());
        airtel.loadUrl("https://www.airtel.in/bank/mobile-prepaid?utm_source=Google&utm_medium=Search&utm_campaign=Search_Brand_Exact");

        WebSettings webSettings = airtel.getSettings();
        webSettings.setJavaScriptEnabled(true);
        airtel.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        airtel.getSettings().setAppCacheEnabled(true);
        airtel.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(airtel.canGoBack()){
            airtel.goBack();
        }else {
            super.onBackPressed();
        }
    }
}