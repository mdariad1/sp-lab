package org.example;

import java.util.Collection;
import java.util.List;

public class Chapter {
    Book book;
    String name;
    List<SubChapter> subchapters;

    public Chapter(String name){
        this.name = name;
    }
    public void print(){
        System.out.println(book);
    }

    public int createSubChapter(String name) {
        this.subchapters.add(new SubChapter(name));
        return this.subchapters.size();
    }
    public SubChapter getSubChapter(int subChapterIndex) {
        return this.subchapters.get(subChapterIndex);
    }
}
