package com.low.level.design.design.pattern.mediatorDesignPattern;

public interface Colleague {
    void placeBid(int bidAmount);
    void bidNotification(int bidAmount);
    String getName();
}
