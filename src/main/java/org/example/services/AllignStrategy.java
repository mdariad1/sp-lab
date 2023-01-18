package org.example.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public interface AllignStrategy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = null;
    String render(String p);

}
