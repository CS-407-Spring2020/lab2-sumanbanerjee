package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        Log.i("info", "button clicked");
        EditText myTextField = (EditText) findViewById(R.id.editText);
        // Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToSecondActivity(myTextField.getText().toString());
    }

    public void goToSecondActivity (String str) {

        Intent intent = new Intent (this, SecondActivity.class);
        intent.putExtra("message", str);
        startActivity (intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
