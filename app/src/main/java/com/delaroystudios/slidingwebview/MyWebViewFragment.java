package com.delaroystudios.slidingwebview;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewFragment extends Fragment {

	ProgressDialog mProgress;
	WebView webview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.web_fragment, container,
				false);

		Bundle bundle = getArguments();

		String url = bundle.getString("url");

		webview = (WebView) rootView.findViewById(R.id.webview1);

		WebSettings settings = webview.getSettings();
		settings.setJavaScriptEnabled(true);

		mProgress = ProgressDialog.show(getActivity(), "Loading",
				"Please wait for a moment...");
		webview.loadUrl(url);

		webview.setWebViewClient(new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {

				view.loadUrl(url);
				return true;
			}

			@Override
			public void onPageFinished(WebView view, String url) {
				super.onPageFinished(view, url);
				if (mProgress.isShowing()) {
					mProgress.dismiss();
				}
			}
		});

		return rootView;
	}

}