package com.low.level.design.design.pattern.nullDesignPattern.after;

public class NullVehicle implements Vehicle{
    private String color;
    private int seatingCapacity;

    public NullVehicle(){
        //do nothing
    }
    @Override
    public void start() {
        //do nothing
    }

    @Override
    public void stop() {
        //do nothing
    }
}
