package com.example.virtualatm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LogiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logi);
    }
    

    public void register (View view) {
        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
    }

    public void skip (View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
