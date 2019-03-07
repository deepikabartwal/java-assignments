package com.step.assignment;

public class NumberOfDaysInMonth {
    public static void main(String[] args){
        System.out.println(getDaysInMonth(5,2000));
    }

    public static boolean isLeapYear(int year) {
        if(year>0 && year<10000) {
            if (year % 100 == 0 && year % 400 == 0) {
                return true;
            }
            if(year%100!=0 && year%4==0){
                return true;
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if(month<1 ||month>12|| year >9999|| year<1){
            return -1;
        }
        switch (month){
            case 2:{
                if(isLeapYear(year)){
                    return  29;
                }
                return 28;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                return 31;
            }
            default:{
                return 30;
            }
        }
    }
}
