package com.low.level.design.solid.principles.single.responsibility.principle.before;


/*
* here we have total of 3 responsibilites. We are violating the rule here.
*
* */
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

    //responsibility 2
    public void printInvoice(){

    }

    //responsibility 3
    public void saveToDB(){

    }
}
