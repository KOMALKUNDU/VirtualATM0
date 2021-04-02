package com.example.virtualatm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    
    
    public void login (View view) {
        startActivity(new Intent(getApplicationContext(), LogiActivity.class));

    }

    public void skip (View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
