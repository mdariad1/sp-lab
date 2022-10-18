package org.example;

public class Paragraph implements Element{
    String text;
    SubChapter subChapter;
    public void print(){
        System.out.println(text);
    }
}
