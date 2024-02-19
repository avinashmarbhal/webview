package com.RahuriMarket.rahurimarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;



public class MainActivity extends AppCompatActivity {
    private WebView webView;
  //  private ProgressBar progressBar;
    //private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // progressBar=findViewById(R.id.progressbar);
      //  swipeRefreshLayout=findViewById(R.id.swiperefresh);

        webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        //progressBar.setVisibility(View.GONE);
        //swipeRefreshLayout.setRefreshing(false);
        webView.loadUrl("https://www.google.com/");



    }
    public class mywebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view,String url){
//            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//                @Override
//                public void onRefresh() {
//                    webView.reload();
//                }
//            });
//
//            return true;
//        }
    }
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()) {
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }

    private class myWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            //progressBar.setVisibility(View.GONE);
          //  swipeRefreshLayout.setRefreshing(false);
            super.onPageFinished(view, url);
        }
    }
}