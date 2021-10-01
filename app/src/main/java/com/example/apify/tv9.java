package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class tv9 extends AppCompatActivity {


    private WebView tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv9);

        tv9=(WebView) findViewById(R.id.tv9webview);
        tv9.setWebViewClient(new WebViewClient());
        tv9.loadUrl("https://tv9.com/");

        WebSettings webSettings = tv9.getSettings();
        webSettings.setJavaScriptEnabled(true);
        tv9.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        tv9.getSettings().setAppCacheEnabled(true);
        tv9.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(tv9.canGoBack()){
            tv9.goBack();
        }else {
            super.onBackPressed();
        }
    }
}