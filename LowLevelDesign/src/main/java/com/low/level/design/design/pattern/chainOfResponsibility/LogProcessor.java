package com.low.level.design.design.pattern.chainOfResponsibility;

public abstract class LogProcessor {

    public static final int DEBUG = 1;
    public static final int INFO  = 2;
    public static final int ERROR = 3;
    public static final int FATAL = 4;
    int level;


    LogProcessor nextLogProcessorInTheChain;

    public void log(int level, String message){
        if(this.level == level){
            // log the message
        }
        if(this.nextLogProcessorInTheChain!=null){
            nextLogProcessorInTheChain.log(level,message);
        }
    }
    abstract protected void logMessage(String message);

}
