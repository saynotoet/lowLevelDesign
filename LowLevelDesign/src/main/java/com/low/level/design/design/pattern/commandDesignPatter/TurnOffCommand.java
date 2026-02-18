package com.low.level.design.design.pattern.commandDesignPatter;

public class TurnOffCommand implements ICommand{

    AirConditioner airConditioner;

    public TurnOffCommand(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }

    private void turnOff(){
        airConditioner.isOn=false;
    }
    private void turnOn(){
        airConditioner.isOn=true;
    }
    
    @Override
    public void execute() {
        turnOff();
    }

    @Override
    public void undo() {
        turnOn();
    }
}