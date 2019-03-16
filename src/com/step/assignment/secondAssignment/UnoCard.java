package com.step.assignment.secondAssignment;


public class UnoCard implements Duplicable<DuplicateUnoCard> {
    private String color;
    private String symbol;

    public UnoCard(String color, String symbol) {
        this.color = color;
        this.symbol = symbol;
    }


    @Override
    public DuplicateUnoCard duplicate() {
        return new DuplicateUnoCard(this.color,this.symbol);
    }
}


