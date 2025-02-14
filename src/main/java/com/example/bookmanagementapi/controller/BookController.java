package com.example.bookmanagementapi.controller;

import com.example.bookmanagementapi.model.Book;
import com.example.bookmanagementapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/sort/{field}")
    public List<Book> getAllBooksSorted(@PathVariable String field){
        return this.bookService.getAllBooksSorted(field);
    }

    @GetMapping("books/{bookId}")
    public Book getBook(@PathVariable Long bookId){
        return this.bookService.getBook(bookId);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book newBook){
        return this.bookService.addBook(newBook);
    }

    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable Long bookId, @RequestBody Book book){
        return this.bookService.updateBook(bookId, book);
    }

    @DeleteMapping("/books/{bookId}")
    public Book deleteBook(@PathVariable Long bookId){
        return this.bookService.deleteBook(bookId);
    }

}
