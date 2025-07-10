package com.low.level.design.design.pattern.strategy.after;

 import com.low.level.design.design.pattern.strategy.after.strategy.NormalDriveStrategy;

public class PassengerCar extends Vehicle {

    PassengerCar( ) {
        super(new NormalDriveStrategy());
    }
}
