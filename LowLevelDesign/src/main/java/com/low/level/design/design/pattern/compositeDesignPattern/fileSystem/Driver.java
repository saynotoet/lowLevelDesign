package com.low.level.design.design.pattern.compositeDesignPattern.fileSystem;


public class Driver {
    public static void main(String[] args) {
        Directory rootNode = new Directory("Folder1");
        File file1 = new File("abc.txt");
        rootNode.add(file1);
        Directory directory2 = new Directory("Folder2");
        File file2= new File("xyz.txt");
        directory2.add(file2);
        rootNode.add(directory2);

        rootNode.ls();
    }
}
