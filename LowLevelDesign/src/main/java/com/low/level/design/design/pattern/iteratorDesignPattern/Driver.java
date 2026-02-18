package com.low.level.design.design.pattern.iteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Book> bookList= new ArrayList<>();

        bookList.add(new Book("Book1",10));
        bookList.add(new Book("Book2",20));
        bookList.add(new Book("Book3",30));
        bookList.add(new Book("Book4",40));
        bookList.add(new Book("Book5",50));

        Library library = new Library(bookList);

        Iterator iterator = library.createIterator();

        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println("Book: "+ book.bookName +" "+book.price);
        }



    }

}
