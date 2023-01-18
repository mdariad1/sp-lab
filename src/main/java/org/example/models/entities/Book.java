package org.example.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.example.models.interfaces.Element;
import org.example.models.interfaces.Visitee;
import org.example.models.interfaces.Visitor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Book extends Section implements Visitee {

    @JsonIgnore
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Author> authors;

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column
    private String title;

    public Book(String title){
        super(title);
        this.authors = new ArrayList<Author>();
        this.children = new ArrayList<AbstractElement>();
    }

    public Book() {
        super();
    }


    public void addAuthor(Author author){
        this.authors.add(author);
    };
    public void addContent(AbstractElement element){
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
    public <T>  T accept(Visitor<T> v) {
        return v.visitBook(this);
    }
}
