package com.low.level.design.design.pattern.factory.simplefactory;

public class ShapeFactory {

    public static Shape getShape(SHAPE_TYPE shapeType){
        if(SHAPE_TYPE.CIRCLE.equals(shapeType)){
            return new Circle();
        }
        else if(SHAPE_TYPE.SQUARE.equals(shapeType)){
            return new Square();
        }
        throw new IllegalArgumentException();
    }
}
