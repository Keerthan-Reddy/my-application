package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class medimg extends AppCompatActivity {

    private WebView medimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medimg);

        medimg=(WebView) findViewById(R.id.medimgwebview);
        medimg.setWebViewClient(new WebViewClient());
        medimg.loadUrl("https://www.1mg.com/");

        WebSettings webSettings = medimg.getSettings();
        webSettings.setJavaScriptEnabled(true);
        medimg.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        medimg.getSettings().setAppCacheEnabled(true);
        medimg.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(medimg.canGoBack()){
            medimg.goBack();
        }else {
            super.onBackPressed();
        }
    }
}