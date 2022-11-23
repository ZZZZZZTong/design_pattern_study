package com.design_pattern_study.myTemplate;

public class StringDisplay extends AbstractDisplay {

    String string;
    int width;
    public StringDisplay(String s){
        this.string=s;
        this.width = s.getBytes().length;
    }

    @Override
    void open() {
    printLine();
    }

    @Override
    void print() {
        System.out.println("|"+string+"|");
    }

    @Override
    void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
