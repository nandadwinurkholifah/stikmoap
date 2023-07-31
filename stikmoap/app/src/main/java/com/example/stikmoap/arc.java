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

public class arc extends AppCompatActivity {
    WebView webview;
    WebSettings websetting1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arc);
        getSupportActionBar().hide();

        webview = (WebView)findViewById(R.id.webview1);
        websetting1 = webview.getSettings();

        //aktivasi java script
        websetting1.setJavaScriptEnabled (true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://mojokertokab.bps.go.id/publication/arc#arcTab1.html/");


        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        websetting1.setLoadsImagesAutomatically(true);

        webview.setDownloadListener(new DownloadListener() { // fungsi download listener untuk mengambil data lalu di download
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                request.setMimeType("application/pdf");
                String cookies = CookieManager.getInstance().getCookie(url);
                request.addRequestHeader("cookie", cookies);
                request.addRequestHeader("User-Agent", userAgent);
                request.setDescription("Downloading File...");
                request.setTitle(URLUtil.guessFileName(url, contentDisposition, "application/pdf"));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                request.setDestinationInExternalPublicDir(
                        Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(
                                url, contentDisposition, "application/pdf"));
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(request);
                Toast.makeText(getApplicationContext(), "Downloading File", Toast.LENGTH_LONG).show();
            }
        });

    }
}