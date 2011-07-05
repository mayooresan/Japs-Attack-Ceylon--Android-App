package com.mayuonline.japscey;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelloWebViewClient extends WebViewClient {

	 @Override
	 public boolean shouldOverrideUrlLoading(WebView view, String url) {
	 view.loadUrl(url);
	 return true;
	 }
}
