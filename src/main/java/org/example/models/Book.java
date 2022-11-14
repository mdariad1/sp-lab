package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section implements Visitee{
    List<Author> authors;

    public Book(String title){
        super(title);
        this.authors = new ArrayList<Author>();
        this.children = new ArrayList<Element>();
    }


    public void addAuthor(Author author){
        this.authors.add(author);
    };
    public void addContent(Element element){
       this.children.add(element);
    }

    public void print(){
        System.out.println("Book: " + title + "\n");

        System.out.println("Authors: ");
        for (int i = 0; i < authors.size(); i++) {
            authors.get(i).print();
        }
        System.out.println();

        for (int i = 0; i < children.size(); i++) {
            children.get(i).print();
        }



    }

    @Override
    public void accept(Visitor v) {

    }
}
