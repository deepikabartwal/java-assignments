package com.step.assignment;

public class NumberToWords {
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        int givenNumber = number;
        while(givenNumber >0){
            givenNumber /= 10;
            count++;
        }
        return count;
    }
    public static int reverse(int number){
        int numberReverse = 0;
        Integer givenNumber = number;
        if(number<0){
            givenNumber = -1*number;
        }
        while(givenNumber>0){
            numberReverse *= 10;
            numberReverse += givenNumber%10;
            givenNumber /=10;
        }
        if(number<0){
            return -1*numberReverse;
        }
        return numberReverse;
    }
    public static String convertNumberInWord(int number){
        switch(number){
            case 0: {
                return "Zero";
            }
            case 1: {
                return "One";
            }
            case 2: {
                return "Two";
            }
            case 3: {
                return "Three";
            }
            case 4: {
                return "Four";
            }
            case 5: {
                return "Five";
            }
            case 6: {
                return "Six";
            }
            case 7: {
                return "Seven";
            }
            case 8: {
                return "Eight";
            }
            case 9: {
                return "Nine";
            }
            default: {
                return "Other";
            }
        }
    }
    public static String numberToWords(int number){
        if(number<0){
            return "Invalid Value";
        }
        String numbersInWord = "";
        int numberOfDigits = getDigitCount(number);
        int reverseOfNumber = reverse(number);
        String delimiter = "";
        for(int i =0; i<numberOfDigits;i++){
            numbersInWord = numbersInWord + delimiter +convertNumberInWord(reverseOfNumber%10);
            reverseOfNumber /= 10;
            delimiter = " ";
        }
        return numbersInWord;
    }
}
