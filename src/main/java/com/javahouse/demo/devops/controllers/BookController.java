package com.javahouse.demo.devops.controllers;

import com.javahouse.demo.devops.annotations.V1API;
import com.javahouse.demo.devops.entities.Book;
import com.javahouse.demo.devops.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@V1API
public class BookController
{
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> provideBookDetails()
    {
        return bookService.fetchBookDetails();
    }
}
