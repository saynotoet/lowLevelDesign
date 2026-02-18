package com.low.level.design.design.pattern.mediatorDesignPattern;

public interface AuctionMediator {

    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);

}
