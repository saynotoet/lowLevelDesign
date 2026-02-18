package com.low.level.design.design.pattern.iteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class Library {
    List<Book> bookList;

    public Library(List<Book> bookList){
        this.bookList=bookList;
    }

    public Iterator createIterator(){
        return new BookIterator(bookList);
    }
}
