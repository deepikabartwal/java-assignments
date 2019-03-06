package com.step.assignment;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round( kilometersPerHour/1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = "+ milesPerHour +" mi/h");
    }
}
