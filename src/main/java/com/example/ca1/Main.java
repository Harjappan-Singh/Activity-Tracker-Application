package com.example.ca1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        start();
    }

    public static void start(){
        Activities userActivities = new Activities();
        String fileName = "activity_data_10.csv";

        // reading file and storing into arrayList
        try (Scanner sc = new Scanner(new File("activity_data_10.csv")))
        {
            if(sc.hasNextLine())
                sc.nextLine();

            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                String [] tokens = line.split(", ");

                String name = tokens[0];
                String date = tokens[1];
                int duration = Integer.parseInt(tokens[2]);
                double distance = Double.parseDouble(tokens[3]);
                int heartRate = Integer.parseInt(tokens[4]);

                userActivities.addActivity(new Activity(name,date,duration,distance,heartRate));
            }
//            userActivities.setIntensities();

            // Menu
            Scanner kbrd = new Scanner(System.in);
            boolean flag = true;
            while (flag){
                System.out.println("1. Display Activities");
                System.out.println("2. View Sorted Activities");
                System.out.println("3. View Subset");
                System.out.println("4. Find activity");
                System.out.println("5 View statistics");
                System.out.println("6. Exit");
                int userInput = kbrd.nextInt();
                switch (userInput){
                    case 1 -> userActivities.display();
                    case 2 -> userActivities.viewSortedActivities();
                    case 3 -> userActivities.viewSubsetActivities();
                    case 4 -> userActivities.findActivity();
                    case 5 -> userActivities.viewStatistics();
                    case 6 -> flag = false;
                    default -> System.out.println("Enter Valid option");
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("FileNotFoundException caught. The file " +fileName+ " may not exist." + exception);
        }
    }
}
