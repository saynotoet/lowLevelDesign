package com.low.level.design.solid.principles.liskov.substitution.principle.before;

public class Bicycle implements Bike{
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no Engine");
    }

    @Override
    public void accelarate() {
        this.speed=this.speed+10;
    }
}
