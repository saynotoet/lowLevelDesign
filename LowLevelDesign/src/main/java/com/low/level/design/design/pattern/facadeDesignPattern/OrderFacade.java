package com.low.level.design.design.pattern.facadeDesignPattern;

public class OrderFacade {

    private  Invoice invoice;
    private  Order order;
    private  Payment payment;
    private  Product product;

    public OrderFacade() {
        this.invoice = new Invoice();
        this.order = new Order();
        this.payment = new Payment();
        this.product = new Product();
    }


    public void makeOrder(){
        product.getProduct();
        payment.getPayment();
        invoice.generateInvoice();
    }
}
