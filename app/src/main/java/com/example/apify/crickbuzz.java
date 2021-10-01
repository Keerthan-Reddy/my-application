package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class crickbuzz extends AppCompatActivity {

    private WebView crickbuzz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crickbuzz);

        crickbuzz=(WebView) findViewById(R.id.crickbuzzwebview);
        crickbuzz.setWebViewClient(new WebViewClient());
        crickbuzz.loadUrl("https://www.cricbuzz.com/");

        WebSettings webSettings = crickbuzz.getSettings();
        webSettings.setJavaScriptEnabled(true);
        crickbuzz.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        crickbuzz.getSettings().setAppCacheEnabled(true);
        crickbuzz.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(crickbuzz.canGoBack()){
            crickbuzz.goBack();
        }else {
            super.onBackPressed();
        }
    }
}