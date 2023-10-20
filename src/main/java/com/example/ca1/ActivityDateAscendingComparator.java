package com.example.ca1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Comparator;

public class ActivityDateAscendingComparator implements Comparator<Activity> {

    public int compare(Activity act1, Activity act2){
        String act1DateStr = act1.getDate();
        String act2DateStr = act2.getDate();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate act1Date = LocalDate.parse(act1DateStr, f);
        LocalDate act2Date = LocalDate.parse(act2DateStr, f);
        return  act1Date.compareTo(act2Date);
    }
}
