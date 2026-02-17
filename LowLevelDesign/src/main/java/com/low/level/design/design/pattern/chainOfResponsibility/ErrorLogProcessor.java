package com.low.level.design.design.pattern.chainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{


    public ErrorLogProcessor(int level, LogProcessor nextLogProcessor){
        this.level = level;
        this.nextLogProcessorInTheChain = nextLogProcessor;

    }

    @Override
    protected void logMessage(String message) {
        System.out.println("Error: "+ message);
    }
}
