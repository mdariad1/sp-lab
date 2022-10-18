package org.example;

import java.util.Collection;
import java.util.List;

public class Book {
    String title;
    Author author;
    Collection<Chapter> chapters;
    public void print(){
        System.out.println(title);
    }
}
