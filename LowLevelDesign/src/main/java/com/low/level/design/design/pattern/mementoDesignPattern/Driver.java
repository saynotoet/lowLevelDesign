package com.low.level.design.design.pattern.mementoDesignPattern;

public class Driver {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        ConfigurationOriginator originator = new ConfigurationOriginator(5,5);

        ConfigurationMemento snapshot1 = originator.createMemento();
        careTaker.addMemento(snapshot1);

        originator.height=10;
        originator.width=10;

        ConfigurationMemento snapshot2 = originator.createMemento();

        careTaker.addMemento(snapshot2);

        originator.restorMemento(snapshot1);
        
    }
}
