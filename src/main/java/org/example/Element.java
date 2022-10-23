package org.example;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get();
}
