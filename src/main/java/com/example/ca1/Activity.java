package com.example.ca1;

public class Activity {
    private String name;
    private String date;
    private int duration;
    private int distance;
    private int heartRate;
    public Activity() {
    }
    public Activity(String name, String date, int duration, int distance, int heartRate) {
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.heartRate = heartRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int hearRate) {
        this.heartRate = hearRate;
    }
}
