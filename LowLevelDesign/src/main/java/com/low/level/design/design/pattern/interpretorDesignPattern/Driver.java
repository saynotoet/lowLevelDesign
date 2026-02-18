package com.low.level.design.design.pattern.interpretorDesignPattern;

public class Driver {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a",2);
        context.put("b",4);

        // a*b    trying to intrept this expression
        AbstractExpression expression = new MultiplyNonTerminalExpression(
          new NumberTerminalExpression("a"),
          new NumberTerminalExpression("b")
        );


        System.out.println(expression.interpret(context));
    }
}
