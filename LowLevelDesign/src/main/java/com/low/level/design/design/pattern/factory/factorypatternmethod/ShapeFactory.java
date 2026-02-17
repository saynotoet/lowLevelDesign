package com.low.level.design.design.pattern.factory.factorypatternmethod;

public abstract class ShapeFactory {

    public  Shape getShape(SHAPE_TYPE shapeType){
        if(SHAPE_TYPE.CIRCLE.equals(shapeType)){
            CircleFactory factory= new CircleFactory();
            return factory.getShape();
        }
        else if(SHAPE_TYPE.SQUARE.equals(shapeType)){
            SquareFactory factory = new SquareFactory();
            return factory.getShape();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
