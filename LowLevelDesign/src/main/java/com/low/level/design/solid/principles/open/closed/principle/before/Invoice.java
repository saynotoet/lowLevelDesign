package com.low.level.design.solid.principles.open.closed.principle.before;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    //responsibility 1
    public int calculateTotal(){
        return 0;
    }

}