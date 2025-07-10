package com.low.level.design.solid.principles.open.closed.principle.before;

/*
* Invoice DAO me aik new method saveToFile add kia hai. ye violation hai.
* */

public class InvoiceDAO {
    private Invoice invoice;

    public InvoiceDAO(Invoice invoice){
        this.invoice=invoice;
    }

     public void saveToDB(){

    }

    public void saveToFile(){

    }

}