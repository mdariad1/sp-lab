package org.example;

public class TableOfContents implements Element {
    String something;
    public void print(){
        System.out.println(this.something);
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
