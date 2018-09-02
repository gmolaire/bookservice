package com.gumold.example.bookservice.service;

import com.gumold.example.bookservice.model.Book;
import com.gumold.example.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Mono<Book> findById(String id) {
        return bookRepository.findById(id);
    }

    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

    public Mono<Book> save(Book book) {
        return bookRepository.save(book);
    }

    public Mono<Void> deleteById(String id) {
        return bookRepository.deleteById(id);
    }
}
