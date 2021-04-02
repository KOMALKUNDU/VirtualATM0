package com.example.virtualatm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    EditText name, email, phone, password;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        
        name = findViewById(R.id.emailPhone);
        email = findViewById(R.id.passWord);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
    }
    
    
    public void login (View view) {
        startActivity(new Intent(getApplicationContext(), LogiActivity.class));

    }

    public void skip (View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
