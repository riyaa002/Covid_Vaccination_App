package com.example.covidvaccination;

public class slot {
        private String date;
        private String time;
        private String location;
        private String availability;
        private String CenterName;

        // Constructor, getters, and setters
        public slot(String CenterName, String date, String time, String location, String availability) {
            this.CenterName = CenterName;
            this.date = date;
            this.time = time;
            this.location = location;
            this.availability = availability;
        }

    public static slot get(int position) {

        return null;
    }

    public String getCenterName() {
        return CenterName;
    }
    public void setCenterName(String date) {
        this.CenterName = CenterName;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }

}
