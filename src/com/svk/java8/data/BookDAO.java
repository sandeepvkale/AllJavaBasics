package com.svk.java8.data;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(201, "Core Java", 557));
        books.add(new Book(101, "Angular", 300));
        books.add(new Book(501, "Spring In Action", 5927));
        books.add(new Book(301, "Design Patterns", 5857));
        books.add(new Book(401, "Kafka", 570));
        return books;
    }
}
