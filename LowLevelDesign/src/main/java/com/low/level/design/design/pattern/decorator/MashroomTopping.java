package com.low.level.design.design.pattern.decorator;

public class MashroomTopping extends ToppingDecorator{
    public MashroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" Mashroom";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+10;
    }
}
