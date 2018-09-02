package com.gumold.example.bookservice.repository;

import com.gumold.example.bookservice.model.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, String> {
}