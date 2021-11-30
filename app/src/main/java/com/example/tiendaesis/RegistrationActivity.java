package com.example.tiendaesis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getSupportActionBar().hide();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

    }

    public void signup(View view) {
        startActivity(new Intent(RegistrationActivity.this,MainActivity.class));

        String userName =name.getText().toString();
        String userEmail =email.getText().toString();
        String userPassword =password.getText().toString();

        if(TextUtils.isEmpty(userName)){
            Toast.makeText(this,"Enter Name!",Toast.LENGTH_SHORT).show();
        }
        if(TextUtils.isEmpty(userEmail)){
            Toast.makeText(this,"Enter Email Address!",Toast.LENGTH_SHORT).show();
        }
    }

    public void singin(View view) {
        startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
    }
}