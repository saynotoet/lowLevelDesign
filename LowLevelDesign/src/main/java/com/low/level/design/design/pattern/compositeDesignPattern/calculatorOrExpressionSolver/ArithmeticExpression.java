package com.low.level.design.design.pattern.compositeDesignPattern.calculatorOrExpressionSolver;

public class ArithmeticExpression implements Expression{

    Expression leftExpression;
    Expression rightExpression;
    Operation operation;

    public ArithmeticExpression(Expression leftExpression, Expression rightExpression, Operation operation){
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operation=operation;
    }

    @Override
    public int evaluate() {
        int value=0;

        switch (operation){
            case ADD:
                value= leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value= leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value= leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value= leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }
        System.out.println("Expression value is: "+value);
        return value;
    }
}
