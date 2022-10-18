package org.example;

import java.util.Collection;
import java.util.List;

public class Chapter {
    Book book;
    Collection<SubChapter> subchapters;
    public void print(){
        System.out.println(book);
    }
}
