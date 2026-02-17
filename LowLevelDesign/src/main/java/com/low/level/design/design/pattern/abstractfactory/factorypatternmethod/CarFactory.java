package com.low.level.design.design.pattern.abstractfactory.factorypatternmethod;

public interface CarFactory {
    CarInterior createInterior();
    CarExterior createExterior();
}
