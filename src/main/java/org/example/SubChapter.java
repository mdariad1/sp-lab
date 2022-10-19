package org.example;

import java.util.Collection;
import java.util.List;

public class SubChapter {
    Chapter chapter;
    String name;
    List<Element> elements;

    public SubChapter(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(chapter);
    }

    public void createNewParagraph(String name) {
        this.elements.add(new Paragraph(name));
    }

    public void createNewImage(String name) {
        this.elements.add(new Image(name));
    }

    public void createNewTable(String name) {
        this.elements.add(new Table(name));
    }
}
