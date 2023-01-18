package org.example.models.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import org.dom4j.tree.BaseElement;
import org.example.models.interfaces.Element;
import org.example.models.interfaces.Visitee;
import org.example.models.interfaces.Visitor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Section implements Element, Visitee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    String title;

    @ManyToOne(targetEntity = Element.class)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Element parent;

    @JsonIgnore
    //@OneToMany(mappedBy = "parent",cascade = CascadeType.ALL,orphanRemoval = true)
    @OneToMany(targetEntity = Element.class)
    List<Element> children;

    public Section(String title) {
        this.title = title;
        this.children = new ArrayList<Element>();
    }

    public Section() {
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
    public <T>  T accept(Visitor<T> v) {
        return v.visitSection(this);
    }
    public List<Element> getChildren() {
        return children;
    }

    public String getTitle() {
        return title;
    }
}
