package com.step.assignment;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,1,1);
    }
    public static void printEqual(int p1,int p2,int p3) {
        if(p1 < 0 || p2 < 0 || p3 < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if(p1 == p2 && p2 == p3){
            System.out.println("All numbers are equal");
            return;
        }
        if(p1 != p2 && p2 !=p3 && p1 != p3) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }
}
