package com.low.level.design.design.pattern.decorator;

public class SimplePizza implements BasePizza{
    @Override
    public String getDescription() {
        return "Simple Pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
