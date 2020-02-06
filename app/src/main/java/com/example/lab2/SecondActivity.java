package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView2.setText("Hello" + str);

    }
}
