package com.example.ryan.demotext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main3Activity extends AppCompatActivity {

    private static final String TAG = "Ryan -> Main3Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Log.e(TAG, "onCreate: 测试第三次提交");


    }
}
