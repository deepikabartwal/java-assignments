package com.step.assignment;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height<0){
            this.height=0;
            return;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public double getVolume(){
        return super.getArea()*this.getHeight();
    }
}
