package com.step.assignment;

public class FirstANdLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int numberClone = number;
        int lastDigit = number%10;
        int firstDigit = lastDigit;
        while(numberClone>0){
            firstDigit = numberClone%10;
            numberClone /= 10;
        }
        return firstDigit+lastDigit;
    }
}
