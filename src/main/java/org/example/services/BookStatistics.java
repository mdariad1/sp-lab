package org.example.services;


import org.example.models.*;

import java.util.HashMap;
import java.util.List;


public class BookStatistics implements Visitor {
    List<Element> contents;
    Element content;

    @Override
    public void visitBook(Book x) {
        this.contents = x.getChildren();
    }

    @Override
    public void visitSection(Section x) {
        this.contents = x.getChildren();
    }

    @Override
    public void visitTableOfContents(TableOfContents x) {
        this.content = x;
    }

    @Override
    public void visitParagraph(Paragraph x) {
        this.content = x;
    }

    @Override
    public void visitImageProxy(ImageProxy x) {
        this.content = x;
    }

    @Override
    public void visitImage(Image x) {
        this.content = x;
    }

    @Override
    public void visitTable(Table x) {
        this.content = x;
    }

    public void printStatistics(){
        HashMap<String,Integer> dict = new HashMap<>();
        dict.put("Section",0);
        dict.put("Image",0);
        dict.put("Paragraph",0);
        dict.put("Table",0);

        for (int i=0; i< contents.size(); i++){
            if (contents.get(i) instanceof Section)
                dict.put("Section",dict.get("Section")+1);
            if ((contents.get(i) instanceof Image) || (contents.get(i) instanceof ImageProxy))
                dict.put("Image",dict.get("Image")+1);
            if (contents.get(i) instanceof Paragraph)
                dict.put("Paragraph",dict.get("Paragraph")+1);
            if (contents.get(i) instanceof Table)
                dict.put("Table",dict.get("Table")+1);
        }

        System.out.println("Book Statistics:");
        if (dict.get("Section") > 0)
            System.out.println("*** Number of sections: " + dict.get("Section"));
        if (dict.get("Image") > 0)
            System.out.println("*** Number of images: " + dict.get("Image"));
        if (dict.get("Table") > 0)
            System.out.println("*** Number of tables: " + dict.get("Table"));
        if (dict.get("Paragraph") > 0)
            System.out.println("*** Number of paragraphs: " + dict.get("Paragraph"));


    }
}
