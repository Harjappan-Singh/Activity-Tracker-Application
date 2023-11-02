package com.example.ca1;

public class Activity implements Comparable<Activity>{
    private String name;
    private String date;
    private int duration;
    private double distance;
    private int heartRate;

    private Intensity intensity;


    public Activity() {
    }
    public Activity(String name, String date, int duration, double distance, int heartRate, Intensity intensity) {
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.distance = distance;
        this.heartRate = heartRate;
        this.intensity = Intensity.NONE;
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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int hearRate) {
        this.heartRate = hearRate;
    }

    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public int compareTo(Activity ac){
        if (this.name.compareTo(ac.getName()) == 0){
            return Integer.compare(this.duration, ac.getDuration());
        } else{
            return this.name.compareTo(ac.getName());
        }
    }
}
