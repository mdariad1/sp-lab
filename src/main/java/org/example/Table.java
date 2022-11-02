package org.example;

public class Table implements Element {
    String something;
    Element parent;

    public Table(String title) {
        this.something = title;
    }

    @Override
    public void print(){
        System.out.println(something);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int x) {
        return null;
    }

    @Override
    public Element getParent() {
        return parent;
    }

    @Override
    public void setParent(Element el) {
        this.parent = el;
    }
}
