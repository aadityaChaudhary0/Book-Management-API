package com.example.bookmanagementapi.service;

import com.example.bookmanagementapi.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {

    public List<Book> getAllBooks();
    public List<Book> getAllBooksSorted(String filed);
    public Book getBook(Long bookId);
    public Book addBook(Book newBook);
    public Book updateBook(Long bookId, Book book);
    public Book deleteBook(Long bookId);

}
