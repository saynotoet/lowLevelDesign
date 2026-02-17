package com.low.level.design.design.pattern.nullDesignPattern.before;

public class Bike implements Vehicle{
    private String color;
    private int seatingCapacity;

    public Bike(String color, int seatingCapacity){
        this.color=color;
        this.seatingCapacity=seatingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Bike is started and moving");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }
}
