package com.example.covidvaccination;

public class Profile {
    private String name;
    private String email;
    private boolean isVaccinated;
    private int numberOfVaccinations;

    public Profile(String name, String email, boolean isVaccinated, int numberOfVaccinations) {
        this.name = name;
        this.email = email;
        this.isVaccinated = isVaccinated;
        this.numberOfVaccinations = numberOfVaccinations;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public int getNumberOfVaccinations() {
        return numberOfVaccinations;
    }
}

