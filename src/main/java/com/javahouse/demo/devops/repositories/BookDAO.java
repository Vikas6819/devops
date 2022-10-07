package com.javahouse.demo.devops.repositories;

import com.javahouse.demo.devops.entities.Book;

import java.util.List;

public interface BookDAO
{
    List<Book> getBooks();
}
