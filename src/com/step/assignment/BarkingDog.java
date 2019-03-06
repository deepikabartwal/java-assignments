package com.step.assignment;

public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true,8));
    }
    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfTheDay){
        return isDogBarking && (hourOfTheDay < 8 && hourOfTheDay >= 0 || hourOfTheDay > 22 && hourOfTheDay <= 23);
    }
}
