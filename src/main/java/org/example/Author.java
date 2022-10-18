package org.example;

import java.util.Collection;

public class Author {
    String name;
    Collection<Book> books;
    public void print(){
        System.out.println(this.name);
    }
}
