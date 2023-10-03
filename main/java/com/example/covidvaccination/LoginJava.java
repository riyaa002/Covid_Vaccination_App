package com.example.covidvaccination;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginJava extends AppCompatActivity {
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView reg = findViewById(R.id.reg);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        //admin and admin
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Intent intent = new Intent(LoginJava.this, AdminHome.class);
                    startActivity(intent);
                    Toast.makeText(LoginJava.this,"ADMIN LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                } else if (username.getText().toString().equals("user") && password.getText().toString().equals("user")){
                    //correct
                    Intent intent = new Intent(LoginJava.this, UserHome.class);
                    startActivity(intent);
                    Toast.makeText(LoginJava.this,"USER LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                } else
                    //incorrect
                    Toast.makeText(LoginJava.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginJava.this,"Registration Page",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(LoginJava.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}