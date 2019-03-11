package com.step.assignment;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int sumOfAllFactor = 0;
        int divisor = 1;
        while(divisor<number){
            if(number%divisor==0){
                sumOfAllFactor += divisor;
            }
            divisor++;
        }
        return sumOfAllFactor==number;
    }
}
