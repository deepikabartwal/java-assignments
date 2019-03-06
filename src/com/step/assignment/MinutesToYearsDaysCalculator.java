package com.step.assignment;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(730000);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int remainingDays = (int) (minutes/1440)%365;
        int years = (int) (minutes/1440)/365;
        System.out.println(minutes +" min = " + years +" y and " + remainingDays + " d");
    }
}
