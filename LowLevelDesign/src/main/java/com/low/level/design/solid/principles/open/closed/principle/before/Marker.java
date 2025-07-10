package com.low.level.design.solid.principles.open.closed.principle.before;

public class Marker {
    private String name;
    private int price;
    private String color;

    public Marker(String name, String color, int price){
        this.name=name;
        this.color=color;
        this.price=price;
    }
}