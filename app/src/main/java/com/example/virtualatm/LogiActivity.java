package com.example.virtualatm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LogiActivity extends AppCompatActivity {

    EditText email, password;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logi);
        
        email = findViewById(R.id.emailPhone);
        password = findViewById(R.id.passWord);

        signIn = findViewById(R.id.SignUp);
    }
    

    public void register (View view) {
        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
    }

    public void skip (View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
