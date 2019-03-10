package com.step.assignment;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if(number < 0){
            number = number * -1;
        }
        int reversedNumber = 0;
        int originalNumber = number;
        while(originalNumber>0){
            int lastDigit = originalNumber%10;
            originalNumber/=10;
            reversedNumber *=10;
            reversedNumber +=lastDigit;
        }
        return number == reversedNumber;
    }
}
