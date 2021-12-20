package com.example.sijelum2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebBeritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_berita);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        WebView webView = findViewById(R.id.web_berita);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.kompas.com/");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
    }
}