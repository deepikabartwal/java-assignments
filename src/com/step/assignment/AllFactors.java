package com.step.assignment;

public class AllFactors {
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        int factorCandidate = 1;
        while(factorCandidate<=number){
            if(number%factorCandidate==0){
                System.out.println(factorCandidate);
            }
            factorCandidate +=1;
        }
    }
}
