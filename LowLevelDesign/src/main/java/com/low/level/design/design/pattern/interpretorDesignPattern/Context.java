package com.low.level.design.design.pattern.interpretorDesignPattern;

import java.util.*;

public class Context {

    Map<String, Integer> map = new HashMap<>();

    public void put(String str, int i){
        map.put(str,i);
    }

    public int get(String str){
        return map.get(str);
    }

}
