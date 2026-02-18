package com.low.level.design.design.pattern.commandDesignPatter;

import java.util.Stack;

public class RemoteControl {
    private ICommand command;
    private Stack<ICommand> acCommandHistory = new Stack<>();

    public RemoteControl(ICommand command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo(){
        if(!acCommandHistory.isEmpty()){
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }

}