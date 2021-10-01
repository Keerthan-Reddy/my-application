package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ajio extends AppCompatActivity {

    private WebView ajio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajio);

        ajio=(WebView) findViewById(R.id.ajiowebview);
        ajio.setWebViewClient(new WebViewClient());
        ajio.loadUrl("https://www.ajio.com/");

        WebSettings webSettings = ajio.getSettings();
        webSettings.setJavaScriptEnabled(true);
        ajio.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        ajio.getSettings().setAppCacheEnabled(true);
        ajio.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(ajio.canGoBack()){
            ajio.goBack();
        }else {
            super.onBackPressed();
        }
    }
}