package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class sonyliv extends AppCompatActivity {

    private WebView sonyliv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonyliv);

        sonyliv=(WebView) findViewById(R.id.sonylivweb);
        sonyliv.setWebViewClient(new WebViewClient());
        sonyliv.loadUrl("https://www.sonyliv.com/");

        WebSettings webSettings = sonyliv.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(sonyliv.canGoBack()){
            sonyliv.goBack();
        }else {
            super.onBackPressed();
        }
    }
}