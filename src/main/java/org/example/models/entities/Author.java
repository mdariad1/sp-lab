package org.example.models.entities;

import javax.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    @Column
    private String surname;

    @ManyToOne()
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    public Author(String name,String surname){
        this.name = name;
        this.surname = surname;
    };

    public Author(){
    };
    public void print(){
        System.out.println("Author: " + this.name + " " + this.surname);
    }
}
