package com.example.charles.dbtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Charles on 2017/6/1.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_EMPLOYER = "create table Employer("
            +"id integer primary key ,"//autoincrement不需要？
            +"name text,"
            +"pay real"
            +"age integer"
            +"phone text)";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_EMPLOYER);
        Toast.makeText(mContext, "Create succeeded", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){}
}
