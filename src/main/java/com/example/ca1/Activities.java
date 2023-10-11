package com.example.ca1;

import java.util.ArrayList;

public class Activities {
    private ArrayList<Activity> activities = new ArrayList<>();

    public void display(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", "Activity", "Date","Duration(mins)", "Distance(kms)", "Avg Heart-Rate");
        for(Activity activity: activities){
            System.out.printf("%-20s %-20s %-20d %-20d %-20d %n",activity.getName(), activity.getDate(), activity.getDuration(), activity.getDistance(), activity.getHeartRate());
        }
        System.out.println();
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }
}
