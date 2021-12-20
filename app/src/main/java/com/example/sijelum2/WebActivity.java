package com.example.sijelum2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        WebView webView = findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://bnpb.go.id/");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
    }
}