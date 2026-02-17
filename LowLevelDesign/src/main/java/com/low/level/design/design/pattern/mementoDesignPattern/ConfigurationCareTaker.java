package com.low.level.design.design.pattern.mementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento configurationMemento){
        this.history.add(configurationMemento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            ConfigurationMemento lastConfiguratioMemento = history.get(history.size()-1);
            history.remove(lastConfiguratioMemento);
            return lastConfiguratioMemento;
        }
        return null;
    }

}
