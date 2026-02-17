package com.low.level.design.design.pattern.abstractfactory.simplepattern.factorypatternmethod;

public interface CarFactory {
    CarInterior createInterior();
    CarExterior createExterior();
}
