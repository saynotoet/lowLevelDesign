package com.low.level.design.design.pattern.compositeDesignPattern.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> directoryOrFileList;

    public Directory(String directoryName) {
        this.directoryName=directoryName;
        directoryOrFileList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        this.directoryOrFileList.add(fileSystem);
    }

    @Override
    public void ls(){
        System.out.println("Directory: "+directoryName);

        for(FileSystem fileSystem: directoryOrFileList){
            fileSystem.ls();
        }
    }
}
