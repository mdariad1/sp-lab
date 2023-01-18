package org.example.services;


import org.example.models.entities.*;
import org.example.models.interfaces.Element;
import org.example.models.interfaces.Visitor;

import java.util.List;

public class RenderContentVisitor implements Visitor {
    List<Element> contents;
    Element content;

    @Override
    public List<Element> visitBook(Book x) {
        this.contents = x.getChildren();
        return contents;
    }

    @Override
    public List<Element> visitSection(Section x) {
        this.contents = x.getChildren();
        return contents;
    }

    @Override
    public Element visitTableOfContents(TableOfContents x) {
        this.content = x;
        return content;
    }

    @Override
    public Element visitParagraph(Paragraph x) {
        this.content = x;
        return content;
    }

    @Override
    public Element visitImageProxy(ImageProxy x) {
        this.content = x;
        return content;
    }

    @Override
    public Element visitImage(Image x) {
        this.content = x;
        return content;
    }

    @Override
    public Element visitTable(Table x) {
        this.content = x;
        return content;
    }

}
