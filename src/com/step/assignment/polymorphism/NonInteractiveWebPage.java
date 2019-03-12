package com.step.assignment.polymorphism;

import java.util.Scanner;

public class NonInteractiveWebPage extends WebPage{
    @Override
    public void display() {
        super.display();
    }

    @Override
    public String getContent() {
        return super.getContent();
    }

    public void click() {
        System.out.println("Click function is not supported");
    }
}
