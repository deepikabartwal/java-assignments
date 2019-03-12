package com.step.assignment.polymorphism;

import java.util.Scanner;

public class Console implements Displayable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        System.out.println("Type Something....");
        String userInput = scanner.nextLine();
        System.out.println(userInput);
    }
}
