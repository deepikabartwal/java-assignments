package com.step.assignment.polymorphism;

public class PDFPage implements Fetchable{
    @Override
    public String getContent() {
        String content = "Welcome to page";
        return content;
    }
}
