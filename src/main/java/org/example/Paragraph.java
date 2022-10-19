package org.example;

public class Paragraph implements Element{
    String text;
    SubChapter subChapter;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println(text);
    }
}
