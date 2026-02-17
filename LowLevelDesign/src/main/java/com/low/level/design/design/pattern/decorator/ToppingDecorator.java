package com.low.level.design.design.pattern.decorator;

public abstract class ToppingDecorator implements BasePizza{

    BasePizza pizza;

    public ToppingDecorator(BasePizza pizza)
    {
        this.pizza=pizza;
    }
}
