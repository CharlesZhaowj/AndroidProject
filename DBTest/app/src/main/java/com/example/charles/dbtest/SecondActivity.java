package com.example.charles.dbtest;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        dbHelper = new MyDatabaseHelper(this, "Company.db", null, 1);
        Button getIn = (Button)findViewById(R.id.newEm);
        getIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                EditText edname = (EditText)findViewById(R.id.nameEdit);
                EditText edpay = (EditText)findViewById(R.id.payEdit);
                EditText edage = (EditText)findViewById(R.id.ageEdit);
                EditText edphone = (EditText)findViewById(R.id.phoneEdit);
                String iname = edname.getText().toString();
                double ipay = Double.valueOf(edpay.getText().toString()).doubleValue();
                int iage = Integer.valueOf(edage.getText().toString(), 10).intValue();
                String iphonenum = edphone.getText().toString();
                ContentValues values = new ContentValues();
                values.put("name", "doge");
                values.put("real", 2333.3);
                values.put("age", 2);
                values.put("phone", "233333333");
                db.insert("Employer", null, values);
                values.clear();
                Toast.makeText(SecondActivity.this, "Create succeeded", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
