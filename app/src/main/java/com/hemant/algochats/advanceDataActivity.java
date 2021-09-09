package com.hemant.algochats;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.hemant.python.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.webkit.WebSettings;
import android.webkit.WebView;

public class advanceDataActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_data);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webView = (WebView) findViewById(R.id.web_view2);
        Bundle extras = getIntent().getExtras();

        String data = extras.getString("title");
        //  Toast.makeText(this,"data recevied",Toast.LENGTH_SHORT).show();
        String url = "file:///android_asset/advance/" + data + ".html";
        webView.loadUrl(url);
        WebSettings webSettings = webView.getSettings();

        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(true);
        webSettings.setJavaScriptEnabled(true);


    }

}
