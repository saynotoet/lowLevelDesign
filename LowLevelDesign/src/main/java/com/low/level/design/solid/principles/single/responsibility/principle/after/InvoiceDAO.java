package com.low.level.design.solid.principles.single.responsibility.principle.after;

public class InvoiceDAO {
    private Invoice invoice;

    public InvoiceDAO(Invoice invoice){
        this.invoice=invoice;
    }

    //responsibility 1
    public void save(){

    }
}
