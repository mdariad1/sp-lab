package org.example;

import java.util.Collection;

public class Author {
    String name;
    Collection<Book> books;

    public Author(String name){
        this.name = name;
    };
    public void print(){
        System.out.println(this.name);
    }
}
