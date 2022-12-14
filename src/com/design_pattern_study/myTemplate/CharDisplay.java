package com.design_pattern_study.myTemplate;

public class CharDisplay extends AbstractDisplay {
    private char ch;

   public CharDisplay(char ch){
        this.ch = ch;
    }

    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(ch);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
