package com.low.level.design.design.pattern.nullDesignPattern.after;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){

        if(type.equals("Bike")) {
            return new Bike("Black",2);
        }else if(type.equals("Car")){
            return new Car("White", 5);
        }
        return new NullVehicle();
    }
}
