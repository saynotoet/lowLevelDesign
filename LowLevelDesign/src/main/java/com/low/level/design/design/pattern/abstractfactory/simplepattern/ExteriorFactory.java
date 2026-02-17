package com.low.level.design.design.pattern.abstractfactory.simplepattern;

public class ExteriorFactory {

    public static CarExterior getCarExterior(String type){
        if("economy".equals(type)){
            return new EconomyExterior();
        }
        else if("luxury".equals(type)){
            return new LuxuryExterior();
        }
        else
            return null;
    }
}
