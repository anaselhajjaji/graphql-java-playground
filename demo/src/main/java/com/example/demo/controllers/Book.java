package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

public record Book (String id, String name, int pageCount, String authorId) {

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Effective Java", 416, "author-1"),
            new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
            new Book("book-3", "Down Under", 436, "author-3"),
            new Book("book-4", "Book 4", 250, "author-4"),
            new Book("book-5", "Book 5", 250, "author-5"),
            new Book("book-6", "Book 6", 250, "author-6"),
            new Book("book-7", "Book 7", 250, "author-7"),
            new Book("book-8", "Book 8", 250, "author-8"),
            new Book("book-9", "Book 9", 250, "author-9"),
            new Book("book-10", "Book 10", 250, "author-10")
            
    );

    public static Book getById(String id) {
        return books.stream()
				.filter(book -> book.id().equals(id))
				.findFirst()
				.orElse(null);
    }
}
