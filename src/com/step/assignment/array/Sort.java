package com.step.assignment.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        descendingSort(numbers);
        printArray(numbers);
        printArray(ascendingSort(numbers));
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
public static int[] getIntegers(int count) {
    int[] numbers = new int[count];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < count; i++) {
        numbers[i]  = scanner.nextInt();
    }
    return numbers;
}
    public static int[] descendingSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] < list[j + 1]) {
                    int acc = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = acc;

                }
            }
        }
        return list;
    }
    public static int[] ascendingSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int acc = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = acc;

                }
            }
        }
        return list;
    }
}
