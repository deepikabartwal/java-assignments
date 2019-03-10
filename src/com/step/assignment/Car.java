package com.step.assignment;

public class Car extends Vehicle{
    private int numberOfSeats;
    private int numberOfDoors;
    private String model;
    private int gear;
    private String engine;

    public Car(String vehicleName, int wheels, int speed,  int numberOfSeats, int numberOfDoors, String model, int gear, String engine) {
        super(vehicleName, wheels, speed);
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.model = model;
        this.gear = gear;
        this.engine = engine;
    }
    public void handSteering(){
        System.out.println("handling the steering");
    }

    @Override
    public void accelerate(int speedIncrement) {
        super.accelerate(speedIncrement);
    }

    @Override
    public void decelerate(int speedDecrement) {
        super.decelerate(speedDecrement);
    }

    @Override
    public void ride(String riderName) {
        super.ride(riderName);
    }

    @Override
    public void move() {
        super.move();
    }
    public void  changeGear(){
        this.gear ++;
    }
}
