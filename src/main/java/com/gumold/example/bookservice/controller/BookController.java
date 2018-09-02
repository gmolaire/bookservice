package com.gumold.example.bookservice.controller;

import com.gumold.example.bookservice.model.Book;
import com.gumold.example.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/book/{id}")
    public Mono<Book> getBookById(@PathVariable String id) {
        return bookService.findById(id);
    }

    @GetMapping(value = "/books")
    public Flux<Book> getAllBooks() {
        return bookService.findAll();
    }

    @PostMapping(value = "/book")
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookService.save(book);
    }
}
