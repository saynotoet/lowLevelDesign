package com.low.level.design.design.pattern.interpretorDesignPattern;

public class NumberTerminalExpression implements AbstractExpression{

    String str;

    public NumberTerminalExpression(String str){
        this.str= str;
    }

    @Override
    public int interpret(Context context) {
        return context.get(str);
    }
}
