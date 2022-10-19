package org.example;

public class Table implements Element {
    String title;
    SubChapter subChapter;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println(title);
    }
}
