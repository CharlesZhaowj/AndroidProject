package com.example.subway0514;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {
    public static final String FOOD_IMAGE_ID = "fruit_image_id";
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        int fruitImageId = intent.getIntExtra(FOOD_IMAGE_ID, 0);
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setBlockNetworkImage(false);
        webView.getSettings().setJavaScriptEnabled(true);
        if(fruitImageId == 0) {

            webView.loadUrl("http://mp.weixin.qq.com/s/Oh5bSPPyMCW_sqRF63aCog");
        }

        else if(fruitImageId == 1) {
            webView.loadUrl("http://mp.weixin.qq.com/s/9Fu2KwLvXx_bKb_0ad28fQ");
        }
        /*
            case 2:
                webView.loadUrl("http://mp.weixin.qq.com/s/VFWnJdICvIMXW6tKZGW2zQ");
                break;
            case 3:
                webView.loadUrl("http://mp.weixin.qq.com/s/cf904KXuiI7_vk4Y-rXC1g");
                break;
            case 4:
                webView.loadUrl("http://mp.weixin.qq.com/s/4IGOUblmSKYq_DgKMiR_bA");
                break;
                */


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(WebActivity.this, PhotoActivity.class);
                startActivity(intent2);
            }
        });
    }

}
