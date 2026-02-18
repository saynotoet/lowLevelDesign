package com.low.level.design.design.pattern.commandDesignPatter;

public class TurnOnCommand implements ICommand{

    AirConditioner airConditioner;

    public TurnOnCommand(AirConditioner airConditioner){
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
        turnOn();
    }

    @Override
    public void undo() {
        turnOff();
    }
}
