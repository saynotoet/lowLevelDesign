package com.low.level.design.design.pattern.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(int level, LogProcessor nextLogProcessor){
        this.level = level;
        this.nextLogProcessorInTheChain = nextLogProcessor;

    }

    @Override
    protected void logMessage(String message) {
        System.out.println("INFO: "+ message);
    }
}
