package com.low.level.design.design.pattern.chainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {


    public DebugLogProcessor(int level, LogProcessor nextLogProcessor){
        this.level = level;
        this.nextLogProcessorInTheChain = nextLogProcessor;

    }

    @Override
    protected void logMessage(String message) {
        System.out.println("DEBUG: "+ message);
    }

}
