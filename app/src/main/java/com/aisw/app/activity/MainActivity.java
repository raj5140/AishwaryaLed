package com.aisw.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.aisw.app.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
        finish();
    }

}