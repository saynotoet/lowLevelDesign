package com.low.level.design.design.pattern.adapterDesignPattern.adapter;

import com.low.level.design.design.pattern.adapterDesignPattern.adaptee.WeightMachineForBabies;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    private final WeightMachineForBabies weightMachineForBabies;

    public WeightMachineAdapterImpl(WeightMachineForBabies weightMachineForBabies) {
        this.weightMachineForBabies = weightMachineForBabies;
    }


    @Override
    public double getWeightInKg() {
        return weightMachineForBabies.getWightInPound() * 0.45;
    }
}
