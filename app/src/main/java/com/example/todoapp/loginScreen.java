package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginScreen extends AppCompatActivity {

    TextView createOne;
    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        createOne=findViewById(R.id.textcreateone);
        username =findViewById(R.id.editTextuserName);
        password =findViewById(R.id.editTextpw);
        login = findViewById(R.id.btnlogin);


        createOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loginScreen.this,signUpScreen.class);
                startActivity(intent);
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loginScreen.this, main_screen.class);
                startActivity(intent);
            }
        });
    }
}