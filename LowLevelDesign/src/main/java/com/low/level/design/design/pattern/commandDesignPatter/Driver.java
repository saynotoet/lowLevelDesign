package com.low.level.design.design.pattern.commandDesignPatter;

public class Driver {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        RemoteControl remoteControl = new RemoteControl(new TurnOnCommand(airConditioner));


        remoteControl.pressButton();
        remoteControl.undo();

    }
}
