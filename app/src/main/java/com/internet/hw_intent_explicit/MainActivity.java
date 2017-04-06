package com.internet.hw_intent_explicit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void call(View v)
    {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
        finish();
    }
}
