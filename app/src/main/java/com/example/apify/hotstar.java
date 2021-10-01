package com.example.apify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class hotstar extends AppCompatActivity {

    private WebView hotstar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotstar);

        hotstar=(WebView) findViewById(R.id.hotstarweb);
        hotstar.setWebViewClient(new WebViewClient());
        hotstar.loadUrl("https://www.hotstar.com/in");

        WebSettings webSettings = hotstar.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        amazon.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        //       amazon.getSettings().setAppCacheEnabled(true);
//        amazon.getSettings().setDomStorageEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(hotstar.canGoBack()){
            hotstar.goBack();
        }else {
            super.onBackPressed();
        }
    }
}