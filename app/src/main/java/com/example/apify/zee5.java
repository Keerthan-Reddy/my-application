package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class zee5 extends AppCompatActivity {

    private WebView zee5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zee5);

        zee5=(WebView) findViewById(R.id.zee5web);
        zee5.setWebViewClient(new WebViewClient());
        zee5.loadUrl("https://www.zee5.com/");

        WebSettings webSettings = zee5.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(zee5.canGoBack()){
            zee5.goBack();
        }else {
            super.onBackPressed();
        }
    }
}