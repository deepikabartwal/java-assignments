package com.step.assignment;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(19,22,53));
    }
    public static boolean isTeen(int number){
        return 13<=number && number<=19;
    }
    public static boolean hasTeen(int number1,int number2, int number3){
        return isTeen(number1) || isTeen(number2) || isTeen(number3);
    }

}
