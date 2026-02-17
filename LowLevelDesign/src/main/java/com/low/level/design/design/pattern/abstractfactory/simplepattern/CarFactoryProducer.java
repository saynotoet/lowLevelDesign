package com.low.level.design.design.pattern.abstractfactory.simplepattern;

public class CarFactoryProducer {
    public static Object getFactory(String choice){
        if(choice.equals("exterior"))
        {
            return  new ExteriorFactory();
        }
        else if(choice.equals("interior")){
            return new InteriorFactory();
        }

        return null;
    }
}
