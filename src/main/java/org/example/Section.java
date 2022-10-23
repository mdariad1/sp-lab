package org.example;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    String title;
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
        this.children.add(element);
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get() {
        return null;
    }
}
