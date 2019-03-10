package com.step.assignment;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber){
        if(firstNumber<10 || secondNumber<10){
            return -1;
        }
        int greaterNumber = Math.max(firstNumber,secondNumber);
        int smallerNumber = Math.min(firstNumber,secondNumber);
        int divisor = smallerNumber;
        while(divisor>0){
            if(smallerNumber%divisor==0 && greaterNumber%divisor == 0){
                return divisor;
            }
            divisor--;
        }
        return 1;
    }
}
