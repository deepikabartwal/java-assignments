package com.step.assignment;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }
    public static boolean isLeapYear(int year) {
        return year%100 ==0 && year%400==0 && year%4==0;
    }
}