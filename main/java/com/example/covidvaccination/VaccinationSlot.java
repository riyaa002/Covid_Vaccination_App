package com.example.covidvaccination;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VaccinationSlot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.available_slots);


//        Initialize the RecyclerView and the adapter
        ArrayList<slot> slotList = new ArrayList<>();

        slotList.add(new slot("CAMA Hospital","23/09/23","09:00:00","Borivali","Available"));
        slotList.add(new slot("Najam Baug Hall","23/09/23","09:00:00","Malad","Available"));
        slotList.add(new slot("Willingdon Sports Club","23/09/23","09:00:00","Kandivali","Available"));
        slotList.add(new slot("BPK Sahakari Vidya Mandir","23/09/23","09:00:00","Goregaon","Available"));
        slotList.add(new slot("TNMC & B.Y.L Nair Ch. Hospital","23/09/23","09:00:00","Vasai","Available"));
        slotList.add(new slot("Dr Babasaheb Memorial GH (Railways)","23/09/23","09:00:00","Nalasopara","Available"));
        slotList.add(new slot("City Hospital","23/09/23","10:30:00","Mumbai Central","Available"));
        slotList.add(new slot("Unity Health Clinic","23/09/23","11:15:00","Andheri","Available"));
        slotList.add(new slot("Green Park Medical Center","23/09/23","14:45:00","Dadar","Available"));
        slotList.add(new slot("Sunrise Health Hospital","23/09/23","16:20:00","Borivali","Available"));
        slotList.add(new slot("Lotus Medical Center","23/09/23","17:45:00","Thane","Available"));


        RecyclerView recyclerView = findViewById(R.id.recyclerViewAvailableSlots);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(slotList); // Provide a list of VaccinationSlot objects
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



}
