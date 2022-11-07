package org.example;

public class Paragraph implements Element{
    String text;
    Element parent;

    AllignStrategy strategy;
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

    public void setAlignStrategy(AllignStrategy strategy) {
        this.strategy = strategy;
        this.text = strategy.render(text);
    }


}
