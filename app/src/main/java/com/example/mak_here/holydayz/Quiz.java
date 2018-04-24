package com.example.mak_here.holydayz;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Quiz extends AppCompatActivity {
    private WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        w=(WebView)findViewById(R.id.webView);
        WebSettings webSettings = w.getSettings();
        w.getSettings().setJavaScriptEnabled(true);
        w.setVerticalScrollBarEnabled(true);
        w.setHorizontalScrollBarEnabled(true);
        w.getSettings().setBuiltInZoomControls(true);
        w.loadUrl("https://4screens.net/e/5783c7fb076bc60100165305");
        //improve webView performance
        w.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        w.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        w.getSettings().setAppCacheEnabled(true);
        w.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        w.setWebViewClient(new MyWebviewClient());
    }
    public void onBackPressed(){
        if(w.canGoBack())
            w.goBack();
        else{
            super.onBackPressed();
        }
    }

    private class MyWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("www.facebook.com")) {
                //open url contents in webview
                return false;
            } else {
                //here open external links in external browser or app
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
                return true;
            }

        }
        //ProgressDialogue
        ProgressDialog pd = null;

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            pd=new ProgressDialog(Quiz.this);
            pd.setTitle("Please Wait..");
            pd.setMessage("Website is Loading..");
            pd.show();
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            pd.dismiss();
            super.onPageFinished(view, url);
        }
    }
    //goto previous page when pressing back button

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (w.canGoBack()) {
                        w.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}