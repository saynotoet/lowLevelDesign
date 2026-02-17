package com.low.level.design.design.pattern.decorator;

public class VegetablePizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Vegetable Pizza";
    }

    @Override
    public int getCost() {
        return 120;
    }
}
