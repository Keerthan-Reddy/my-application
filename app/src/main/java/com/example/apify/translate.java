package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class translate extends AppCompatActivity {



        private WebView translate;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_translate);

            translate=(WebView) findViewById(R.id.translatewebview);
            translate.setWebViewClient(new WebViewClient());
            translate.loadUrl("https://translate.google.co.in/");

            WebSettings webSettings = translate.getSettings();
            webSettings.setJavaScriptEnabled(true);
            translate.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            translate.getSettings().setAppCacheEnabled(true);
            translate.getSettings().setDomStorageEnabled(true);
        }

        @Override
        public void onBackPressed() {
            if(translate.canGoBack()){
                translate.goBack();
            }else {
                super.onBackPressed();
            }
        }
    }