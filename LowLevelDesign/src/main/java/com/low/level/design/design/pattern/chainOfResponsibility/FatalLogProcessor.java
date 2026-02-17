package com.low.level.design.design.pattern.chainOfResponsibility;

public class FatalLogProcessor extends LogProcessor {


    public FatalLogProcessor(int level, LogProcessor nextLogProcessor){
        this.level = level;
        this.nextLogProcessorInTheChain = nextLogProcessor;

    }

    @Override
    protected void logMessage(String message) {
        System.out.println("Fatal: "+ message);
    }
}
