package org.example;

public class Paragraph implements Element{
    String text;
    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get() {
        return null;
    }
}
