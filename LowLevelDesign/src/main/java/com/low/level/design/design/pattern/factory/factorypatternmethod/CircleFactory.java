package com.low.level.design.design.pattern.factory.factorypatternmethod;

public class CircleFactory extends ShapeFactory{

    public Shape getShape(){
        return new Circle();
    }
}
