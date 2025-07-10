package com.low.level.design.solid.principles.dependency.inversion.principle.before;

public class Laptop {

    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public Laptop(){
        keyboard=new WiredKeyboard();
        mouse=new WiredMouse();
    }
}
