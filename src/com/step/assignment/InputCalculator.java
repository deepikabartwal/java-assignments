package com.step.assignment;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(scanner.hasNextInt()){
            count += 1;
            sum += scanner.nextInt();

        }
        int avg = Math.round((float)sum/count);
        System.out.println( "SUM = " + sum + " AVG = " + Math.round(avg));

    }
}