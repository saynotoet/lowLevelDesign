package com.low.level.design.design.pattern.strategy.after;

import com.low.level.design.design.pattern.strategy.after.strategy.SportsDriveStrategy;

public class SportsCar extends Vehicle {

    SportsCar() {
        super(new SportsDriveStrategy());
    }
}
