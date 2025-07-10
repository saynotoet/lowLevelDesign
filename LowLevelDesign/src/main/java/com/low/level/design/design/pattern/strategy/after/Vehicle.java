package com.low.level.design.design.pattern.strategy.after;

import com.low.level.design.design.pattern.strategy.after.strategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
