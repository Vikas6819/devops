package com.javahouse.demo.devops.services;

import com.javahouse.demo.devops.entities.Book;

import java.util.List;

public interface BookService
{
    List<Book> fetchBookDetails();
}
