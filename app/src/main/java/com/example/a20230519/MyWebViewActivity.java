package com.example.a20230519;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MyWebViewActivity extends AppCompatActivity {

    EditText editText;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);
        editText = findViewById(R.id.url);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new TestBrowser());

    }

    public void open(View view){
        String url = editText.getText().toString();
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);

    }
    class TestBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //return super.shouldOverrideUrlLoading(view, request);
            view.loadUrl(url);
            return true;
        }
    }


}