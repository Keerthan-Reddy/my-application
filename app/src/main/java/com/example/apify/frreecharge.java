package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class frreecharge extends AppCompatActivity {

    private WebView frreecharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frreecharge);

        frreecharge=(WebView) findViewById(R.id.freechargewebview);
        frreecharge.setWebViewClient(new WebViewClient());
        frreecharge.loadUrl("https://www.freecharge.in/");

        WebSettings webSettings = frreecharge.getSettings();
        webSettings.setJavaScriptEnabled(true);
          frreecharge.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
          frreecharge.getSettings().setAppCacheEnabled(true);
          frreecharge.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(frreecharge.canGoBack()){
            frreecharge.goBack();
        }else {
            super.onBackPressed();
        }
    }
}