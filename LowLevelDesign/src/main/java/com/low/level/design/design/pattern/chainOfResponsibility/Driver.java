package com.low.level.design.design.pattern.chainOfResponsibility;

public class Driver {

    public static void main(String[] args) {
        LogProcessor fatalLogger =new FatalLogProcessor(LogProcessor.FATAL, null);
        LogProcessor errorLogger =new ErrorLogProcessor(LogProcessor.ERROR, fatalLogger);
        LogProcessor infoLogger =new InfoLogProcessor(LogProcessor.INFO, errorLogger);
        LogProcessor debugLogger =new DebugLogProcessor(LogProcessor.DEBUG, infoLogger);

        debugLogger.log(LogProcessor.DEBUG,"This is debug message");
        debugLogger.log(LogProcessor.INFO,"This is info message");
        debugLogger.log(LogProcessor.ERROR,"This is error message");
        debugLogger.log(LogProcessor.FATAL,"This is fatal message");

    }
}
