package com.hemant.algochats;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.hemant.python.R;

class DataStructure extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastructure1);
        WebView webView = (WebView) findViewById(R.id.web_view4);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String data = extras.getString("title");
            //  Toast.makeText(this,"data recevied",Toast.LENGTH_SHORT).show();
            String url = "file:///android_asset/datastructures/" + data + ".html";
            webView.loadUrl(url);
            WebSettings webSettings = webView.getSettings();

            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(true);
            webSettings.setJavaScriptEnabled(true);
        }
    }
}
