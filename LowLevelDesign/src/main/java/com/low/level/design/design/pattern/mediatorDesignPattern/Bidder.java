package com.low.level.design.design.pattern.mediatorDesignPattern;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator){
        this.name=name;
        this.auctionMediator=auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public void bidNotification(int bidAmount) {
        System.out.println("Bidder: "+name+" received notification that someone has place bid with amount: "+bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
