package com.step.assignment;

public class Vehicle {
    private String vehicleName;
    private int wheels;
    private int speed;

    public Vehicle(String vehicleName, int wheels, int speed) {
        this.vehicleName = vehicleName;
        this.wheels = wheels;
        this.speed = speed;
    }

    public void move(){
        System.out.println("vehicle is moving");
    }
    public void ride(String riderName){
        System.out.println(riderName + " is riding the vehicle");
    }

    public void accelerate(int speedIncrement){
        this.speed -= speedIncrement;
    }
    public void decelerate( int speedDecrement){
        this.speed -= speedDecrement;
    }
}
