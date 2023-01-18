package org.example.controllers;

import org.example.models.entities.Book;
import org.example.models.interfaces.Element;
import org.example.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Element> getUserById (@PathVariable("id") Integer id) {
        Book book = bookRepository.findBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        bookRepository.save(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

}