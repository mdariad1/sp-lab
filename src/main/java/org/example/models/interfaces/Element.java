package org.example.models.interfaces;

import javax.persistence.*;

@Entity()
public interface Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;

    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int x);

    Element getParent();
    void setParent(Element el);
}
