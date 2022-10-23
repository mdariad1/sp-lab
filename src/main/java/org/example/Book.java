package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Book extends Section{
    List<Author> authors;
    List<Element> content;


    public Book(String title){
        super(title);
        this.authors = new ArrayList<Author>();
        this.content = new ArrayList<Element>();
    }


    public void addAuthor(Author author){
        this.authors.add(author);
    };
    public void addContent(Element element){
       this.content.add(element);
    }

    public void print(){
        System.out.println("Book: " + title + "\n");

        System.out.println("Authors: ");
        for (int i = 0; i < authors.size(); i++) {
            authors.get(i).print();
        }
        System.out.println();

        for (int i = 0; i < content.size(); i++) {
            content.get(i).print();
        }



    }
}
