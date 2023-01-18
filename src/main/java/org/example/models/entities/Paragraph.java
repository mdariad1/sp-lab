package org.example.models.entities;

import org.example.models.interfaces.Element;
import org.example.models.interfaces.Visitee;
import org.example.models.interfaces.Visitor;
import org.example.services.AllignStrategy;

import javax.persistence.*;

@Entity
public class Paragraph implements Element, Visitee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String text;

    @ManyToOne(targetEntity = AbstractElement.class)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    AbstractElement parent;

    @Transient
    AllignStrategy strategy;
    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph() {

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
        this.parent = (AbstractElement) el;
    }

    public void setAlignStrategy(AllignStrategy strategy) {
        this.strategy = strategy;
        this.text = strategy.render(text);
    }


    @Override
    public <T>  T accept(Visitor<T> v) {
        return v.visitParagraph(this);
    }

    public String getText() {
        return text;
    }

    public AllignStrategy getStrategy() {
        return strategy;
    }
}
