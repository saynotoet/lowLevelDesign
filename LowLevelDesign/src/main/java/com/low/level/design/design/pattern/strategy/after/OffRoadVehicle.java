package com.low.level.design.design.pattern.strategy.after;

 import com.low.level.design.design.pattern.strategy.after.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle( ) {
        super(new SportsDriveStrategy());
    }
}
