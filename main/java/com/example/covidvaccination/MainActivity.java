package com.example.covidvaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

        TextView txtlogin ;
        Button btnsignup ;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);
            txtlogin = findViewById(R.id.txtlogin);
            btnsignup = findViewById(R.id.btnsignup);

            btnsignup.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Registration SUCCESSFUL",Toast.LENGTH_SHORT).show();

//                if (validateEditTexts()) {
//                    Toast.makeText(RegisterJava.this,"Registration SUCCESSFUL",Toast.LENGTH_SHORT).show();
//
//                }
                }
            });

            txtlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"Login Page",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, LoginJava.class);
                    startActivity(intent);
                }
            });
        }
    }
