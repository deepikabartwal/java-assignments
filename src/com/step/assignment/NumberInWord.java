package com.step.assignment;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
    }
    public static void printNumberInWord(int number){
        System.out.println(convertNumberInWord(number));
    }
    public static String convertNumberInWord(int number){
        if(number==0){
            return "";
        }
        if(number==1){
            return "ONE";
        }
        if(number==2){
            return "TWO";
        }
        if(number==3){
            return "THREE";
        }
        if(number==4){
            return "FOUR";
        }
        if(number==5){
            return "FIVE";
        }
        if(number==6){
            return "SIX";
        }
        if(number==7){
            return "SEVEN";
        }
        if(number==8){
            return "EIGHT";
        }
        if(number==9){
            return "NINE";
        }
        return "OTHER";
    }
}
