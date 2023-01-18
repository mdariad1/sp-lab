package org.example.models.entities;

import org.example.models.interfaces.Element;

import javax.persistence.*;


@Entity
public class AbstractElement implements Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;

    @ManyToOne(targetEntity = AbstractElement.class)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private AbstractElement parent;

    @Override
    public void print() {

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
        return null;
    }

    @Override
    public void setParent(Element el) {

    }
}
