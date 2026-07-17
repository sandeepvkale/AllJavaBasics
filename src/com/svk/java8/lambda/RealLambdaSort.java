package com.svk.java8.lambda;

import com.svk.java8.data.Book;
import com.svk.java8.data.BookDAO;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Sorting done based on Name
public class RealLambdaSort {

    public List<Book> getBooksSorted() {
        List<Book> books = new BookDAO().getBooks();
        //Collections.sort(books, new MyComparator()); // Using traditional Manual method
        // using Lambda
        Collections.sort(books, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
        return books;
    }

    public static void main(String[] args) {
        System.out.println("\n" + new RealLambdaSort().getBooksSorted());
    }
}

// Traditional use of comparator
class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}