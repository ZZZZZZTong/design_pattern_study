package com.design_pattern_study;

import com.design_pattern_study.myIterator.Iterator;
import com.design_pattern_study.myIterator.bean.Book;
import com.design_pattern_study.myIterator.bean.BookShelf;
import com.design_pattern_study.myTemplate.AbstractDisplay;
import com.design_pattern_study.myTemplate.CharDisplay;
import com.design_pattern_study.myTemplate.StringDisplay;

public class Main {

    public static void main(String[] args) {
        //迭代器模式
//        BookShelf bookShelf =  new BookShelf();
//        bookShelf.appendBook(new Book("A"));
//        bookShelf.appendBook(new Book("B"));
//        bookShelf.appendBook(new Book("C"));
//        bookShelf.appendBook(new Book("D"));
//        // 接口多态
//        Iterator it = bookShelf.iterator();
//        while (it.hasNext()){
//            Book book = (Book) it.next();
//            System.out.println(book.getName());
//        }

        //模板模式
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello,world.");
        d1.display();
        d2.display();
    }
}
