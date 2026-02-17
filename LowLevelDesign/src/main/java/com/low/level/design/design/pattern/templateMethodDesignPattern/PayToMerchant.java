package com.low.level.design.design.pattern.templateMethodDesignPattern;

public class PayToMerchant extends PaymentProcessor{

    @Override
    public void validate() {
        //custom logic with flexibility to add any logic
    }

    @Override
    public void calculatePlatformFees() {
        //custom logic with flexibility to add any logic
    }

    @Override
    public void debitAmount() {
        //custom logic with flexibility to add any logic
    }

    @Override
    public void creditAmount() {
        //custom logic with flexibility to add any logic
    }
}