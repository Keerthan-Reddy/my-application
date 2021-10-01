package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class spotify extends AppCompatActivity {

    private WebView spotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify);

        spotify=(WebView) findViewById(R.id.spotifyweb);
        spotify.setWebViewClient(new WebViewClient());
        spotify.loadUrl("https://www.spotify.com/");

        WebSettings webSettings = spotify.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(spotify.canGoBack()){
            spotify.goBack();
        }else {
            super.onBackPressed();
        }
    }
}