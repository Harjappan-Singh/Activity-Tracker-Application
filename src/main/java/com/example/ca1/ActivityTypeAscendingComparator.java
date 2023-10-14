package com.example.ca1;

import java.util.Comparator;

public class ActivityTypeAscendingComparator implements Comparator<Activity> {

    public int compare(Activity ac1, Activity ac2){
        return ac1.getName().compareTo(ac2.getName());
    }
}
