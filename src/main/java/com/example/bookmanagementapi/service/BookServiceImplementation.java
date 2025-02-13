package com.example.bookmanagementapi.service;

import com.example.bookmanagementapi.model.Book;
import com.example.bookmanagementapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImplementation implements BookService{

    @Autowired
    private BookRepository bookRepository;

    List<Book> bookList;

    public BookServiceImplementation(){
        bookList = new ArrayList<>();
    }

    public List<Book> getAllBooks(){
        return this.bookRepository.findAll();
    }

    public List<Book> getAllBooksSorted(String field){
        return this.bookRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public Book getBook(Long bookId){
        return bookRepository.findById(bookId).orElse(new Book());
    }

    public Book addBook(Book newBook){
        return bookRepository.save(newBook);
    }

    public Book updateBook(Long bookId, Book book){
        Optional<Book> existingBook = bookRepository.findById(bookId);
        if(existingBook.isPresent()){
            Book updatedBook = existingBook.get();

            updatedBook.setTitle(book.getTitle());
            updatedBook.setAuthor(book.getAuthor());
            updatedBook.setIsbn(book.getIsbn());
            updatedBook.setPublicationDate(book.getPublicationDate());

            return bookRepository.save(updatedBook);
        }
        return null;
    }

    public Book deleteBook(Long bookId){
        Optional<Book> existingBook = bookRepository.findById(bookId);
        if (existingBook.isPresent()){
            bookRepository.deleteById(bookId);
            return existingBook.get();
        }
        return null;
    }

}
