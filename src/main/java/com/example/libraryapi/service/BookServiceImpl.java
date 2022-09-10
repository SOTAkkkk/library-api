package com.example.libraryapi.service;

import com.example.libraryapi.domain.BookList;
import com.example.libraryapi.domain.BookSelector;
import com.example.libraryapi.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public BookList find(BookSelector selector) {
        BookList bookList = new BookList();
        bookList.setBookList(this.repository.findList(selector));
        return bookList;
    }
}
