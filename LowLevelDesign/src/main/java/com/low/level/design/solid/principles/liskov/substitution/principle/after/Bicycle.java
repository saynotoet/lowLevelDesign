package com.low.level.design.solid.principles.liskov.substitution.principle.after;

public class Bicycle implements Bike {
    int speed;


    @Override
    public void accelarate() {
        this.speed=this.speed+10;
    }
}
