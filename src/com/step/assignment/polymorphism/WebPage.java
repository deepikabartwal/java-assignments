package com.step.assignment.polymorphism;

import java.util.Scanner;

public class WebPage implements Displayable,Printable{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        String content = getContent();
        System.out.println(content);
    }

    @Override
    public String getContent() {
        String content = scanner.nextLine();
        return content;
    }

    public void click() {
        System.out.println("You clicked on this option");
    }
}
