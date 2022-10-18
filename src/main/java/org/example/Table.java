package org.example;

public class Table implements Element {
    String title;
    SubChapter subChapter;
    public void print(){
        System.out.println(title);
    }
}
