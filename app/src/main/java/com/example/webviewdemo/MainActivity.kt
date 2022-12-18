package com.example.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var webview = findViewById<WebView>(R.id.webViewId)


        webview.loadUrl("https://www.google.com")

        val htmlData = "<body> Gujrat University</body>"

    var str =    "<!DOCTYPE html>"+
        "<head>"+
        "<title>Document</title>"+
        "</head>"+
       " <body>"+

        "<center>"+
        "<h1> welcome to Gujrat University</h1>"+
        "</center>"+
        "<marquee> welcome To Gujrat University</marquee>"+

        "<center>"+
        "<a href= https://www.guaim.org/\"><u>go to official website</u>"+
        "<u> go to Official website</u>"+
        "</center>"+

        "</body>"+
        "</html>"

        webview.webViewClient = WebViewClient()
        webview.zoomIn()
        webview.zoomOut()

        webview.loadData(str, "text/html", "utf-8")

    }
}