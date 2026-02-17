package com.low.level.design.design.pattern.decorator;

public class PaneerTopping extends ToppingDecorator{
    public PaneerTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
