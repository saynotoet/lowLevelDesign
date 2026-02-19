package com.low.level.design.design.pattern.compositeDesignPattern.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    String directoryName;
    List<Object> directoryOrFileList = new ArrayList<>();


    public void add(Object object){
        this.directoryOrFileList.add(object);
    }

    public void ls(){
        System.out.println("Directory: "+directoryName);

        for(Object object: directoryOrFileList){
            if(object instanceof File){
                ((File) object).ls();
            }else if(object instanceof Directory){
                ((Directory) object).ls();
            }
        }
    }
}
