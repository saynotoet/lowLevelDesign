package com.low.level.design.design.pattern.mediatorDesignPattern;

import java.util.*;

public class Auction implements AuctionMediator{
    List<Colleague> colleagueList = new ArrayList<>();


    @Override
    public void addBidder(Colleague bidder) {
        colleagueList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague : colleagueList){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.bidNotification(bidAmount);
            }
        }
    }
}
