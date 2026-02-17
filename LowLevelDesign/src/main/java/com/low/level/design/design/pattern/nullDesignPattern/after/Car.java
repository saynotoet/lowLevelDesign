package com.low.level.design.design.pattern.nullDesignPattern.after;

public class Car implements Vehicle {
    private String color;
    private int seatingCapacity;

    public Car(String color, int seatingCapacity){
        this.color=color;
        this.seatingCapacity=seatingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Bike is started and moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }
}
