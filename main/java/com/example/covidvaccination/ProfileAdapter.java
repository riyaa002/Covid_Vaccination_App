package com.example.covidvaccination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {

    private List<Profile> profileList;

    public ProfileAdapter(List<Profile> profileList) {
        this.profileList = profileList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_profiles, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Profile profile = profileList.get(position);
        holder.textName.setText(profile.getName());
        holder.textEmail.setText(profile.getEmail());
        holder.textVaccinationStatus.setText(profile.isVaccinated() ? "Vaccinated" : "Not Vaccinated");
        holder.textNumberOfVaccinations.setText("Number of Vaccinations: " + profile.getNumberOfVaccinations());
    }

    @Override
    public int getItemCount() {
        return profileList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textName;
        TextView textEmail;
        TextView textVaccinationStatus;
        TextView textNumberOfVaccinations;

        ViewHolder(View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.textName);
            textEmail = itemView.findViewById(R.id.textEmail);
            textVaccinationStatus = itemView.findViewById(R.id.textVaccinationStatus);
            textNumberOfVaccinations = itemView.findViewById(R.id.textNumberOfVaccinations);
        }
    }
}
