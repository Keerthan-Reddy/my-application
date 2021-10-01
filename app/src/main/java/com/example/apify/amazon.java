package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class amazon extends AppCompatActivity {

    private WebView amazon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon2);

        amazon=(WebView) findViewById(R.id.amazonwebview);
        amazon.setWebViewClient(new WebViewClient());
        amazon.loadUrl("https://amzn.to/39GrWDj");

        WebSettings webSettings = amazon.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
  //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(amazon.canGoBack()){
            amazon.goBack();
        }else {
            super.onBackPressed();
        }
    }
}