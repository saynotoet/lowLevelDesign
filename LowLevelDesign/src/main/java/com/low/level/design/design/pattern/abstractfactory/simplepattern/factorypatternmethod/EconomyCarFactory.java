package com.low.level.design.design.pattern.abstractfactory.simplepattern.factorypatternmethod;


public class EconomyCarFactory implements CarFactory {
    @Override
    public CarInterior createInterior() {
        return new EconomyInterior();
    }

    @Override
    public CarExterior createExterior() {
        return new EconomyExterior();
    }
}
