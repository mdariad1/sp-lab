package org.example.models;


import java.util.ArrayList;
import java.util.List;

public class Section implements Element,Visitee{
    String title;
    Element parent;
    List<Element> children;

    public Section(String title) {
        this.title = title;
        this.children = new ArrayList<Element>();
    }


    @Override
    public void print() {
        System.out.println(title);
        for (int i = 0; i < children.size(); i++) {
            children.get(i).print();
        }
    }

    @Override
    public void add(Element element) {
        if (element.getParent() != null || element == this){
            throw new UnsupportedOperationException();
        }
        this.children.add(element);
        element.setParent(this);

    }

    @Override
    public void remove(Element element) {
        this.children.remove(element);
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
    public void accept(Visitor v) {
        v.visitSection(this);
    }

    public List<Element> getChildren() {
        return children;
    }
}
