package org.example.models.entities;

import org.example.models.interfaces.Element;
import org.example.models.interfaces.Visitee;
import org.example.models.interfaces.Visitor;

import javax.persistence.*;

@Entity
public class Table implements Element, Visitee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    String something;
    @ManyToOne(targetEntity = Element.class)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    Element parent;

    public Table(String title) {
        this.something = title;
    }

    public Table() {

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

    @Override
    public <T>  T accept(Visitor<T> v) {
        return v.visitTable(this);
    }

    public String getSomething() {
        return something;
    }
}