package com.example.exp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent0 = getIntent();
        String data = intent0.getStringExtra("extra_data");
        Log.d("Second", data);
        Button button3 = (Button) findViewById(R.id.button03);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.putExtra("data_return", "Bonjour FirstActivity");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
