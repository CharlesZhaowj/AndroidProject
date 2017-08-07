package com.example.charles.dbtest;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;
    private TextView tvname;
    private TextView tvpay;
    private TextView tvage;
    private TextView tvphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        dbHelper = new MyDatabaseHelper(this, "Company.db", null, 1);
        tvname = (TextView)findViewById(R.id.tvname);
        tvpay = (TextView)findViewById(R.id.tvpay);
        tvage = (TextView)findViewById(R.id.tvage);
        tvphone = (TextView)findViewById(R.id.tvphone);
        Button searchBt = (Button)findViewById(R.id.search);
        searchBt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                EditText Id = (EditText)findViewById(R.id.readId);
                Cursor cursor = db.query("Employer",null,null,null,null,null,null);
                if(cursor.moveToFirst()){
                    Log.d("MainActivity","I'm OK");
                    String name = cursor.getString(cursor.getColumnIndex("name"));
                    String pay = cursor.getString(cursor.getColumnIndex("pay"));
                    String age = cursor.getString(cursor.getColumnIndex("age"));
                    String phone = cursor.getString(cursor.getColumnIndex("phone"));
                    tvname.setText(name);
                    tvpay.setText(pay);
                    tvage.setText(age);
                    tvphone.setText(phone);
                }
                cursor.close();

            }
        });
    }
}
