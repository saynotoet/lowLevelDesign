package com.low.level.design.design.pattern.compositeDesignPattern.calculatorOrExpressionSolver;

public class Number implements Expression{
    int numberValue;

    public Number(int numberValue){
        this.numberValue=numberValue;
    }

    @Override
    public int evaluate() {
        return numberValue;
    }
}
