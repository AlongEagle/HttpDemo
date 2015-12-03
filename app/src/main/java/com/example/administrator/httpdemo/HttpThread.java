package com.example.administrator.httpdemo;

import android.webkit.WebView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Handler;

/**
 * Created by Administrator on 2015-11-29.
 */
public class HttpThread extends Thread {

    private String url;
    private WebView webView;
    private Handler handler;


    public HttpThread(String url,WebView webView,Handler handler){
        this.url=url;
        this.webView=webView;
        this.handler=handler;
    }

    @Override
    public void run() {
        //this is a demo中文
        //dfdsfsdfsd
        //的负担复旦

        try {
            URL httpURL=new URL(url);
            HttpURLConnection conn= (HttpURLConnection) httpURL.openConnection();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
