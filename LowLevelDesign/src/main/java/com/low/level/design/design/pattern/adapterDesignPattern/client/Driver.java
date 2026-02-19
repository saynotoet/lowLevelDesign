package com.low.level.design.design.pattern.adapterDesignPattern.client;

import com.low.level.design.design.pattern.adapterDesignPattern.adaptee.WeightMachineForBabiesImpl;
import com.low.level.design.design.pattern.adapterDesignPattern.adapter.WeightMachineAdapter;
import com.low.level.design.design.pattern.adapterDesignPattern.adapter.WeightMachineAdapterImpl;

public class Driver {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabiesImpl());
        weightMachineAdapter.getWeightInKg();
    }
}
