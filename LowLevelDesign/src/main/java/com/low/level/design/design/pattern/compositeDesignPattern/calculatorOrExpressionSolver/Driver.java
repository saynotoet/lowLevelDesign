package com.low.level.design.design.pattern.compositeDesignPattern.calculatorOrExpressionSolver;

public class Driver {
    public static void main(String[] args) {


        /*
                2*(1+7) trying to solve this expression.

                    *
                   / \
                  2   +
                      / \
                      1  7
         */


        Expression two = new Number(2);
        Expression one = new Number(1);
        Expression seven = new Number(7);


        Expression addExpression = new ArithmeticExpression(one,seven,Operation.ADD);
        Expression result = new ArithmeticExpression(two,addExpression,Operation.MULTIPLY);

        result.evaluate();

    }
}
