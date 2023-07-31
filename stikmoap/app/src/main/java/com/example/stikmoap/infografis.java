package com.example.stikmoap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class infografis extends AppCompatActivity {
    WebView webview2;
    WebSettings websetting2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infografis);
        getSupportActionBar().hide();

        webview2 = (WebView)findViewById(R.id.webview2);
        websetting2 = webview2.getSettings();

        //aktivasi java script
        websetting2.setJavaScriptEnabled (true);
        webview2.setWebViewClient(new WebViewClient());
        webview2.loadUrl("https://mojokertokab.bps.go.id/galery.html");


        webview2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        websetting2.setLoadsImagesAutomatically(true);

        webview2.setDownloadListener(new DownloadListener() { // fungsi download listener untuk mengambil data lalu di download
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                request.setMimeType("image/jpeg");
                request.allowScanningByMediaScanner();
                String cookies = CookieManager.getInstance().getCookie(url);
                request.addRequestHeader("cookie", cookies);
                request.addRequestHeader("User-Agent", userAgent);
                request.setDescription("Downloading File...");
                request.setTitle(URLUtil.guessFileName(url, contentDisposition, "image/jpeg"));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(
                        Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(
                                url, contentDisposition, "image/jpeg"));
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(request);
                Toast.makeText(getApplicationContext(), "Downloading File", Toast.LENGTH_LONG).show();
            }
        });


    }
}