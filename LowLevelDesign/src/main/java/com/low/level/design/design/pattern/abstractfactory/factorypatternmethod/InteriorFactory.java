package com.low.level.design.design.pattern.abstractfactory.factorypatternmethod;

public class InteriorFactory {
    
    public static CarInterior getCarInterior(String type){
        if("economy".equals(type)){
            return new EconomyInterior();
        }
        else if("luxury".equals(type)){
            return new LuxuryInterior();
        }
        else 
            return null;
    }
}