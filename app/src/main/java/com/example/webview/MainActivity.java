package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView1);

        //to Load this usl in the internet explore
        webView.setWebViewClient(new WebViewClient());

        //give Url to load
        webView.loadUrl("http://www.google.com");
    }

    //this method controls the back button on the device

        @Override
    public void onBackPressed()
        {
            if (webView.canGoBack())
            {
                webView.goBack();
            }
            else
            {
                super.onBackPressed();
            }
        }
}