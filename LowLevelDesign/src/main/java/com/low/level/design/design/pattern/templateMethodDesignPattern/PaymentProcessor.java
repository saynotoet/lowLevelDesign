package com.low.level.design.design.pattern.templateMethodDesignPattern;

public abstract class PaymentProcessor {

   public abstract void validate();
   public abstract void calculatePlatformFees();
   public abstract void debitAmount();
   public abstract void creditAmount();


   public final void sendMoney(){

       validate();
       calculatePlatformFees();
       debitAmount();
       creditAmount();
    }

}
