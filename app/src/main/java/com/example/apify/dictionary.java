package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class dictionary extends AppCompatActivity {

    private WebView dictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        dictionary=(WebView) findViewById(R.id.dictionarywebview);
        dictionary.setWebViewClient(new WebViewClient());
        dictionary.loadUrl("https://www.dictionary.com/browse/search");

        WebSettings webSettings = dictionary.getSettings();
        webSettings.setJavaScriptEnabled(true);
        dictionary.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        dictionary.getSettings().setAppCacheEnabled(true);
        dictionary.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(dictionary.canGoBack()){
            dictionary.goBack();
        }else {
            super.onBackPressed();
        }
    }
}