package com.design_pattern_study;

import com.design_pattern_study.myIterator.Iterator;
import com.design_pattern_study.myIterator.bean.Book;
import com.design_pattern_study.myIterator.bean.BookShelf;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf =  new BookShelf();
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        // 接口多态
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }


    }
}
