package org.example.models;

public class TableOfContents implements Element,Visitee {
    String something;
    Element parent;
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

    @Override
    public <T>  T accept(Visitor<T> v) {
        return v.visitTableOfContents(this);
    }

    public String getSomething() {
        return something;
    }
}
