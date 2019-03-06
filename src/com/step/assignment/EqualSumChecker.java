package com.step.assignment;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,3));
    }
    public static boolean hasEqualSum(int number1,int number2, int number3) {
        int sum = number1 + number2;
        return sum == number3;
    }
}
