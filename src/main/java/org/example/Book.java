package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Book {
    String title;
    Author author;
    List<Chapter> chapters;

    public Book(String title){
        this.title = title;
        this.chapters = new ArrayList<>();
    };

    public void addAuthor(Author author){
        this.author = author;
    };
    public int createChapter(String name){
       this.chapters.add(new Chapter(name));
       return this.chapters.size();
    }

    public void print(){
        System.out.println(title);
    }

    public Chapter getChapter(int chapterIndex) {
        return this.chapters.get(chapterIndex);
    }
}
