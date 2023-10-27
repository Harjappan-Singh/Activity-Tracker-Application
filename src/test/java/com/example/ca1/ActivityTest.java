package com.example.ca1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    @Test
    void getName1() {
        System.out.println("Test 1 (getName): activity with no name");
        Activity obj = new Activity();
        assertEquals(null, obj.getName());
    }

    @Test
    void getName2() {
        System.out.println("Test 2 (getName): activity with a name");
        Activity obj = new Activity("Cycling", "22/02/2022", 34, 2, 100);
        assertEquals("Cycling", obj.getName());
    }

    @Test
    void setName() {
        System.out.println("Test 3 (setName): activity with no name set to 'Running'");
        Activity obj = new Activity();
        obj.setName("Running");
        assertEquals("Running", obj.getName());
    }

    @Test
    void getDate1() {
        System.out.println("Test 4 (getDate): activity with no date value");
        Activity obj = new Activity();
        assertEquals(null, obj.getDate());
    }

    @Test
    void getDate2() {
        System.out.println("Test 5 (getDate): activity with a date value");
        Activity obj = new Activity("Cycling", "22/02/2022", 34, 2, 100);
        assertEquals("22/02/2022", obj.getDate());
    }

    @Test
    void setDate() {
        System.out.println("Test 6 (setDate): activity with no date set to '10/02/2009'");
        Activity obj = new Activity();
        obj.setDate("10/02/2009");
        assertEquals("10/02/2009", obj.getDate());
    }

    @Test
    void getDuration() {
    }

    @Test
    void setDuration() {
    }

    @Test
    void getDistance() {
    }

    @Test
    void setDistance() {
    }

    @Test
    void getHeartRate() {
    }

    @Test
    void setHeartRate() {
    }

    @Test
    void setIntensity() {
    }

    @Test
    void compareTo() {
    }
}