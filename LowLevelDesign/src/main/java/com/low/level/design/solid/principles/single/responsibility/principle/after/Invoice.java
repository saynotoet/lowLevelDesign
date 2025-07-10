package com.low.level.design.solid.principles.single.responsibility.principle.after;

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
