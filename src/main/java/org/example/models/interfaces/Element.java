package org.example.models.interfaces;

import javax.persistence.*;


public interface Element {

    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int x);

    Element getParent();
    void setParent(Element el);
}
