package com.low.level.design.design.pattern.abstractfactory.factorypatternmethod;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public CarInterior createInterior() {
        return new LuxuryInterior();
    }

    @Override
    public CarExterior createExterior() {
        return new LuxuryExterior();
    }
}