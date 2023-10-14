package com.example.ca1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        start();
    }

    public static void start(){
        ArrayList<Activity> myActivities = new ArrayList<>();
        Activity ac1 = new Activity("Swimming", "22/05/2023", 20, 10, 120);
        Activity ac2 = new Activity("Running", "15/06/2023", 30, 5, 150);
        Activity ac3 = new Activity("Cycling", "10/04/2023", 45, 15, 130);
        Activity ac4 = new Activity("Swimming", "05/07/2023", 60, 8, 140);
        Activity ac5 = new Activity("Running", "02/03/2023", 90, 0, 80);
        Activity ac6 = new Activity("Running", "11/08/2023", 40, 2, 160);
        Activity ac7 = new Activity("Swimming", "20/09/2023", 35, 3, 140);
        Activity ac8 = new Activity("Cycling", "12/07/2023", 50, 0, 100);
        Activity ac9 = new Activity("Cycling", "29/06/2023", 45, 7, 150);
        Activity ac10 = new Activity("Cycling", "08/01/2023", 75, 0, 110);



        Activities Harjappan = new Activities();

        Harjappan.addActivity(ac1);
        Harjappan.addActivity(ac2);
        Harjappan.addActivity(ac3);
        Harjappan.addActivity(ac4);
        Harjappan.addActivity(ac5);
        Harjappan.addActivity(ac6);
        Harjappan.addActivity(ac7);
        Harjappan.addActivity(ac8);
        Harjappan.addActivity(ac9);
        Harjappan.addActivity(ac10);

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1. Display Activities");
            System.out.println("2. View Sorted Activities");
            System.out.println("3. View Subset");
            System.out.println("4. Find activity");
            System.out.println("5. Exit");
            int userInput = sc.nextInt();
            switch (userInput){
                case 1 -> Harjappan.display();
                case 2 -> Harjappan.viewSortedActivities();
                case 3 -> Harjappan.viewSubsetActivities();
                case 4 -> Harjappan.findActivity();
                case 5 -> flag = false;
                default -> System.out.println("Enter Valid option");
            }

        }

    }
}
