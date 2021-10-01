package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class gaana extends AppCompatActivity {

    private WebView gaana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaana);

        gaana=(WebView) findViewById(R.id.gaanaweb);
        gaana.setWebViewClient(new WebViewClient());
        gaana.loadUrl("https://gaana.com/");

        WebSettings webSettings = gaana.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(gaana.canGoBack()){
            gaana.goBack();
        }else {
            super.onBackPressed();
        }
    }
}