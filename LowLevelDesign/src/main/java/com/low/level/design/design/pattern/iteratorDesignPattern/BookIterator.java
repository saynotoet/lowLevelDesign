package com.low.level.design.design.pattern.iteratorDesignPattern;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {
    List<Book> books;
    int cursor=0;

    public BookIterator(List<Book> books){
        this.books=books;
    }

    @Override
    public boolean hasNext() {

        return (books != null && cursor<books.size());
    }

    @Override
    public Object next() {
        return books.get(cursor++);
    }
}
