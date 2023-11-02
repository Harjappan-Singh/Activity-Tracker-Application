package com.example.ca1;

public enum Intensity {
    NONE, VERY_LIGHT, LIGHT, MODERATE, VIGOROUS, VERY_VIGOROUS;

    public static double getIntensityValue(Activity ac) {
        double intensityVal = 0.0;
        if (ac.getName().equals("Swimming")) {
            switch (ac.getIntensity()) {
                case VERY_LIGHT -> intensityVal = 5;
                case LIGHT -> intensityVal = 6.3;
                case MODERATE -> intensityVal = 7.6;
                case VIGOROUS -> intensityVal = 8.9;
                case VERY_VIGOROUS -> intensityVal = 10.9;
                default -> intensityVal = 0.0;
            }
        } else if (ac.getName().equals("Running")) {
            switch (ac.getIntensity()) {
                case VERY_LIGHT -> intensityVal = 4.1;
                case LIGHT -> intensityVal = 7.2;
                case MODERATE -> intensityVal = 10;
                case VIGOROUS -> intensityVal = 15.4;
                case VERY_VIGOROUS -> intensityVal = 20.8;
                default -> intensityVal = 0.0;
            }
        } else if (ac.getName().equals("Cycling")) {
            switch (ac.getIntensity()) {
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

