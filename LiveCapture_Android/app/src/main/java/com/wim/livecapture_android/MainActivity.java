package com.wim.livecapture_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wim.livecapture.Preview;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Preview(this));
    }
}
