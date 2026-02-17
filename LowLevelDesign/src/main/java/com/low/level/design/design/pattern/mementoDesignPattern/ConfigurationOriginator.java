package com.low.level.design.design.pattern.mementoDesignPattern;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height=height;
        this.width=width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(height,width);
    }

    public void restorMemento(ConfigurationMemento mementoToBeRestored){
        this.width= mementoToBeRestored.width;
        this.height= mementoToBeRestored.height;
    }
}
