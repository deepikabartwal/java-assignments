package com.step.assignment.polymorphism;

public class PDFPage implements Printable {
    @Override
    public String getContent() {
        String content = "Welcome to page";
        return content;
    }
}
