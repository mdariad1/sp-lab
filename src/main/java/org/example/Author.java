package org.example;
public class Author {
    String name;
    String surname;
    Book book;

    public Author(String name,String surname){
        this.name = name;
        this.surname = surname;
    };
    public void print(){
        System.out.println("Author: " + this.name + " " + this.surname);
    }
}
