package com.example.ca1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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

//    private void sortByDateAscending(){
//        activities.sort((act1, act2) -> )
//    }
//
//    private void sortByDateDescending(){
//        activities.sort((act1, act2) -> )
//    }

    private void sortByDurationAscending(){
        activities.sort((ac1, ac2) -> Integer.compare(ac1.getDuration(), ac2.getDuration()));
    }

    private void sortByDurationDescending(){
        activities.sort((ac1, ac2) -> -1* Integer.compare(ac1.getDuration(), ac2.getDuration()));
    }

    private void sortByTypeAscending(){
        Collections.sort(activities, new ActivityTypeAscendingComparator());
    }

    private void sortByTypeDescending(){
        Collections.sort(activities, new ActivityTypeDescendingComparator());
    }

    private void sortByDistanceAscending(){
        Collections.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity ac1, Activity ac2) {
                return Integer.compare(ac1.getDistance(),ac2.getDistance());
            }
        });
    }

    private void sortByDistanceDescending(){
        Collections.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity ac1, Activity ac2) {
                return -1 * Integer.compare(ac1.getDistance(),ac2.getDistance());
            }
        });
    }



    public void viewSortedActivities(){

        boolean flag = true;
        while (flag){
            this.display();
            System.out.println("Choose any option to view the activities in corresponding order: ");
            System.out.println("1. Ascending order of Calories burned");
            System.out.println("2. Descending order of Calories burned");
            System.out.println("3. Ascending order of date");
            System.out.println("4. Descending order of date");
            System.out.println("5. Ascending order of duration");
            System.out.println("6. Descending order of duration");
            System.out.println("7. Ascending order of type");
            System.out.println("8. Descending order of type");
            System.out.println("9. Ascending order of distance covered");
            System.out.println("10. Descending order of distance covered");
            System.out.println("11. Exit");

            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();
            switch (userChoice){
//                case 1 -> this.sortByCaloriesBurnedAscending();
//                case 2 -> this.sortByCaloriesBurnedDescending();
//                case 3 -> this.sortByDateAscending();
//                case 4 -> this.sortByDateDescending();
                case 5 -> this.sortByDurationAscending();
                case 6 -> this.sortByDurationDescending();
                case 7 -> this.sortByTypeAscending();
                case 8 -> this.sortByTypeDescending();
                case 9 -> this.sortByDistanceAscending();
                case 10 -> this.sortByDistanceDescending();
                case 11 -> flag = false;
                default -> System.out.println("Please enter valid option");
            }
        }

    }

    private void viewActivityType(){
        boolean flag = false;

        System.out.print("Enter the activity type: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next().toLowerCase();
        if(userInput.equals("swimming") || userInput.equals("running")  || userInput.equals("cycling")){
            flag = true;
        }

        if (flag){
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", "Activity", "Date","Duration(mins)", "Distance(kms)", "Avg Heart-Rate");
            for (Activity ac : activities){
                if(ac.getName().toLowerCase().equals(userInput)){
                    System.out.printf("%-20s %-20s %-20d %-20d %-20d %n",ac.getName(), ac.getDate(), ac.getDuration(), ac.getDistance(), ac.getHeartRate());
                }
            }
        } else{
            System.out.println("Activity doesn't exist");
        }
    }

    public void viewSubsetActivities(){
        boolean flag = true;

        while(flag){
            System.out.println("1. View activity based on activity type");
            System.out.println("2. View activity above a minimum distance covered");
            System.out.println("3. View activity based on type of energy expended");
            System.out.println("4. View activity above a minimum duration");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            switch (userInput){
                case 1 -> viewActivityType();
//                case 2 -> viewAboveDistance();
//                case 3 -> viewEnergyType();
//                case 4 -> viewAboveDuration();
                case 5 -> flag = false;
                default -> System.out.println("Invalid Input");
            }
        }

    }
}
