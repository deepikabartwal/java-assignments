package com.step.assignment;

public class DecimalComparator{
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.7563,1.7544));
    }
    public static boolean areEqualByThreeDecimalPlaces(double number1,double number2) {
        int firstNumber = (int) (number1*1000);
        int secondNumber = (int) (number2*1000);
        return firstNumber==secondNumber;
    }
}
