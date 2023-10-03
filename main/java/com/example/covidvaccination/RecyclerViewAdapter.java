package com.example.covidvaccination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    public ArrayList<slot> slotList;
    public RecyclerViewAdapter(ArrayList<slot> slotList) {
        this.slotList = slotList;
    }


    // Constructor and ViewHolder implementation
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vaccine_item, parent, false);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.CenterName.setText(slotList.get(position).getCenterName());
            holder.Date.setText(slotList.get(position).getDate());
            holder.Time.setText(slotList.get(position).getTime());
            holder.Location.setText(slotList.get(position).getLocation());
            holder.Availability.setText(String.valueOf(slotList.get(position).getAvailability()));
        }


    @Override
        public int getItemCount() {
            return slotList.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            TextView CenterName;
            TextView Date;
            TextView Time;
            TextView Location;
            TextView Availability;

            public ViewHolder(View itemView) {
                super(itemView);
                CenterName = itemView.findViewById(R.id.CenterName);
                Date = itemView.findViewById(R.id.Date);
                Time = itemView.findViewById(R.id.Time);
                Location = itemView.findViewById(R.id.Location);
                Availability = itemView.findViewById(R.id.Availability);
            }
        }

}
