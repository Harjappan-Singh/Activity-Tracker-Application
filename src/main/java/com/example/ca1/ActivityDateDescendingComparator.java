package com.example.ca1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class ActivityDateDescendingComparator implements Comparator<Activity> {

    public int compare(Activity act1, Activity act2){
        String act1DateStr = act1.getDate();
        String act2DateStr = act2.getDate();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate act1Date = LocalDate.parse(act1DateStr, f);
        LocalDate act2Date = LocalDate.parse(act2DateStr, f);
        return  -1 * act1Date.compareTo(act2Date);
    }
}
