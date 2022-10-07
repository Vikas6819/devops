package com.javahouse.demo.devops.services;

import com.javahouse.demo.devops.entities.Book;
import com.javahouse.demo.devops.repositories.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;

    @Override
    public List<Book> fetchBookDetails() {
        return bookDAO.getBooks();
    }
}
