package com.low.level.design.design.pattern.mediatorDesignPattern;

public class Driver {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();

        Colleague bidder1= new Bidder("Bidder1",auctionMediator);
        Colleague bidder2= new Bidder("Bidder2",auctionMediator);
        Colleague bidder3= new Bidder("Bidder3",auctionMediator);

        bidder1.placeBid(100);
        bidder2.placeBid(200);
        bidder1.placeBid(300);

    }
}
