package com.low.level.design.design.pattern.facadeDesignPattern;

public class Driver {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.makeOrder();


        //client is only calling makeOrder() and facade is handling all the complexity on its own

    }
}
