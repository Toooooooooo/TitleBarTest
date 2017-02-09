package com.szusst.wutao.titlebartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.szusst.wutao.mytitlebarlibrary.TitleBar;

public class MainActivity extends AppCompatActivity {
    private TitleBar titleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleBar= (TitleBar) findViewById(R.id.titleBar);
        titleBar.initActionBar("123",R.drawable.search_icon,R.drawable.titlebar_return,null);
    }
}
