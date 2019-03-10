package com.step.assignment;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int clonedNumber =  number;
        int sum = 0;
        while(clonedNumber>0){
            int lastDigit = clonedNumber%10;
            if(lastDigit%2==0){
                sum+=lastDigit;
            }
            clonedNumber = clonedNumber/10;
        }
        return sum;
    }
}
