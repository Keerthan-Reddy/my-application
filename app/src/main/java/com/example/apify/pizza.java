package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pizza extends AppCompatActivity {



    private WebView pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        pizza=(WebView) findViewById(R.id.pizzahutwebview);
        pizza.setWebViewClient(new WebViewClient());
        pizza.loadUrl("https://www.pizzahut.co.in/");

        WebSettings webSettings = pizza.getSettings();
        webSettings.setJavaScriptEnabled(true);
        pizza.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        pizza.getSettings().setAppCacheEnabled(true);
        pizza.getSettings().setDomStorageEnabled(true);




    }

    @Override
    public void onBackPressed() {
        if(pizza.canGoBack()){
            pizza.goBack();
        }else {
            super.onBackPressed();
        }
    }
}