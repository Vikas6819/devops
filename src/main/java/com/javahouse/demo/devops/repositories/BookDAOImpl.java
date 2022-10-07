package com.javahouse.demo.devops.repositories;

import com.javahouse.demo.devops.entities.Book;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BookDAOImpl implements BookDAO
{
    @Override
    public List<Book> getBooks() {
        return Arrays.asList(new Book(1, "JAVA", "AA", 300), new Book(2, "DEVOPS", "BB", 500));
    }
}
