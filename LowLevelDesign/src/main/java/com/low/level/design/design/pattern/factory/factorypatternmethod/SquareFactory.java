package com.low.level.design.design.pattern.factory.factorypatternmethod;

public class SquareFactory {
    public Shape getShape(){
        return new Square();
    }
}
