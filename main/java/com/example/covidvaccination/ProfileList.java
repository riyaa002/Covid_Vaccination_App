package com.example.covidvaccination;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileList extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_profile_list);

            // Sample data for profiles
            List<Profile> profileList = new ArrayList<>();
            profileList.add(new Profile("John Doe", "john@example.com", true, 2));
            profileList.add(new Profile("Jane Smith", "jane@example.com", false, 0));
            profileList.add(new Profile("Alice Smith", "alice@example.com", true, 1));
            profileList.add(new Profile("Bob Johnson", "bob@example.com", false, 0));
            profileList.add(new Profile("Eva Brown", "eva@example.com", true, 3));
            profileList.add(new Profile("Christopher James Anderson", "chris@example.com", true, 2));
            profileList.add(new Profile("David Müller", "david.müller@example.com", true, 1));
            profileList.add(new Profile("Jane Doe", "", false, 0));
            profileList.add(new Profile("Max Johnson", "max@example.com", true, 5));
            profileList.add(new Profile("Olivia Williams", "olivia@example.com", true, 2));
            profileList.add(new Profile("Emily Johnson", "emily@example.com", false, 0));
            profileList.add(new Profile("Michael Smith", "michael@example.com", true, 1));
            profileList.add(new Profile("Ava Brown", "ava@example.com", true, 2));
            profileList.add(new Profile("Noah Wilson", "noah@example.com", false, 0));
            profileList.add(new Profile("Olivia Davis", "olivia@example.com", true, 1));


            // Initialize RecyclerView and Adapter
//            @SuppressLint({"MissingInflatedId", "LocalSuppress"})
            RecyclerView recyclerView = findViewById(R.id.recyclerViewProfile);
            ProfileAdapter adapter = new ProfileAdapter(profileList);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // 2 columns in the grid
        }
}
