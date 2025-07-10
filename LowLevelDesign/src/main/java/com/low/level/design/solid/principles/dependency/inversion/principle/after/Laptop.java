package com.low.level.design.solid.principles.dependency.inversion.principle.after;


public class Laptop {

    private final Keyboard keyboard;
    private final Mouse mouse;

    public Laptop(Keyboard keyboard, Mouse mouse){
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
}
