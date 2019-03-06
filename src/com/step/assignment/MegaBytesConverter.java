package com.step.assignment;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2300);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0 ) {
            System.out.println("Invalid Value");
            return;
        }
        int remainingKiloBytes = kiloBytes%1024;
        int megaBytes = kiloBytes/1024;
        System.out.println(kiloBytes+" KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}
