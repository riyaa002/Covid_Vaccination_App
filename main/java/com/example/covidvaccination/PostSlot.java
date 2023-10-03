package com.example.covidvaccination;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PostSlot extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_slots);
        @SuppressLint("InflateParams")

        Button postSlot = findViewById(R.id.buttonPostSlot);

        postSlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PostSlot.this, "Slot Updated Successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
