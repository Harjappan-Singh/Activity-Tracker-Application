package com.example.ca1;

public enum Intensity {
    NONE, VERY_LIGHT, LIGHT, MODERATE, VIGOROUS, VERY_VIGOROUS;

    public static Intensity getIntensity(String name, int duration, double distance){
        Intensity intensity = Intensity.NONE;
        double kmPerHr = distance/ (duration/ 60.0);
        if(name.equals("Swimming")){
            if ( 0 <= kmPerHr && kmPerHr < 0.5){
                intensity = Intensity.VERY_LIGHT;
            } else if (0.5 <= kmPerHr && kmPerHr < 1.25) {
                intensity = Intensity.LIGHT;
            } else if (1.25 <= kmPerHr && kmPerHr < 2.0) {
                intensity = Intensity.MODERATE;
            }else if (2.0 <= kmPerHr && kmPerHr < 2.75) {
                intensity = Intensity.VIGOROUS;
            }else if (2.75 <= kmPerHr && kmPerHr < 3.5) {
                intensity = Intensity.VERY_VIGOROUS;
            }
        } else if(name.equals("Running")){
            if( kmPerHr < 4){
                intensity = Intensity.VERY_LIGHT;
            } else if(4 <= kmPerHr && kmPerHr < 8){
                intensity = Intensity.LIGHT;
            } else if(8 <= kmPerHr && kmPerHr < 12){
                intensity = Intensity.MODERATE;
            } else if(12 <= kmPerHr && kmPerHr < 16){
                intensity = Intensity.VIGOROUS;
            } else if(16 <= kmPerHr && kmPerHr < 24){
                intensity = Intensity.VERY_VIGOROUS;
            }
        } else{ // assuming its Cycling
            if(kmPerHr < 8){
                intensity = Intensity.VERY_LIGHT;
            } else if(8 <= kmPerHr && kmPerHr < 16){
                intensity = Intensity.LIGHT;
            } else if(16 <= kmPerHr && kmPerHr < 25){
                intensity = Intensity.MODERATE;
            } else if(25 <= kmPerHr && kmPerHr < 33){
                intensity = Intensity.VIGOROUS;
            } else if(33 <= kmPerHr && kmPerHr < 40){
                intensity = Intensity.VERY_VIGOROUS;
            }
        }
        return intensity;
    }

    public static double getIntensityValue(String name, Intensity intensity) {
        double intensityVal = 0.0;
        if (name.equals("Swimming")) {
            switch (intensity) {
                case VERY_LIGHT -> intensityVal = 5;
                case LIGHT -> intensityVal = 6.3;
                case MODERATE -> intensityVal = 7.6;
                case VIGOROUS -> intensityVal = 8.9;
                case VERY_VIGOROUS -> intensityVal = 10.9;
                default -> intensityVal = 0.0;
            }
        } else if (name.equals("Running")) {
            switch (intensity) {
                case VERY_LIGHT -> intensityVal = 4.1;
                case LIGHT -> intensityVal = 7.2;
                case MODERATE -> intensityVal = 10;
                case VIGOROUS -> intensityVal = 15.4;
                case VERY_VIGOROUS -> intensityVal = 20.8;
                default -> intensityVal = 0.0;
            }
        } else if (name.equals("Cycling")) {
            switch (intensity) {
                case VERY_LIGHT -> intensityVal = 2;
                case LIGHT -> intensityVal = 5;
                case MODERATE -> intensityVal = 7;
                case VIGOROUS -> intensityVal = 13;
                case VERY_VIGOROUS -> intensityVal = 15;
                default -> intensityVal = 0.0;
            }
        }
        return intensityVal;
    }
}

