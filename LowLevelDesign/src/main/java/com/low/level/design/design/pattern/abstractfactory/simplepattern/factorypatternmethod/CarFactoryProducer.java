package com.low.level.design.design.pattern.abstractfactory.simplepattern.factorypatternmethod;

public class CarFactoryProducer {
    public static Object getFactory(String choice){
        if(choice.equals("economy"))
        {
            return  new EconomyCarFactory();
        }
        else if(choice.equals("luxury")){
            return new LuxuryCarFactory();
        }

        return null;
    }
}
