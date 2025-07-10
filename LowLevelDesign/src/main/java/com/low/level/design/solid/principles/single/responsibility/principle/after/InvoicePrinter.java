package com.low.level.design.solid.principles.single.responsibility.principle.after;


public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice=invoice;
    }

    //responsibility 1
    public void printInvoice(){

    }
}
