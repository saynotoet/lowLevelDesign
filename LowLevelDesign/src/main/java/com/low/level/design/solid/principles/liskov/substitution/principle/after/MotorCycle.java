package com.low.level.design.solid.principles.liskov.substitution.principle.after;

public class MotorCycle implements Bike, MotorizedBike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        this.isEngineOn=true;
    }

    @Override
    public void accelarate() {
        this.speed=this.speed+10;
    }
}
