package com.low.level.design.design.pattern.decorator;

public class ChickenPizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Chicken Pizza";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
