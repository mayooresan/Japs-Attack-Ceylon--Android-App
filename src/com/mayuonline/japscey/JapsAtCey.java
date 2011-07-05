package com.mayuonline.japscey;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;


public class JapsAtCey extends Activity {
	WebView mWebView;
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
	        mWebView.goBack();
	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
       mWebView = (WebView) findViewById(R.id.webview);
       mWebView.getSettings().setJavaScriptEnabled(true);
       mWebView.getSettings().setBuiltInZoomControls(true);
       mWebView.getSettings().setSupportZoom(true);
       mWebView.loadUrl("file:///android_asset/japs/Index.html");
       mWebView.setWebViewClient(new HelloWebViewClient());
       
       
       
        

        
    }
}