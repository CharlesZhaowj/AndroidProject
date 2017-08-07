package com.example.exp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Verbose");
        Log.d(TAG, "Debug");
        Log.i(TAG, "Info");
        Log.w(TAG, "Warn");
        Log.e(TAG, "Error");

        Button button = (Button)findViewById(R.id.Button01);
        ImageButton imageButton = (ImageButton)findViewById(R.id.ImageButton01);
        button.setText("Button按钮");
        imageButton.setImageResource(R.drawable.cp);

        final TextView textView = (TextView)findViewById(R.id.TextView01);
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        textView.setText("Button按钮");
                    } });

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textView.setText("ImageButton按钮");
            } });

        Button button2 = (Button)findViewById(R.id.Button02);
        button2.setText("活动跳转");
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String data = "Bonjour, SecondAct~";
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("extra_data", data);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requesCode, int resultCode, Intent data){
        switch (requesCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstAct", returnedData);
                }
                break;
            default:
        }
    }


    public void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "(9)onDestroy()");
    }
}
