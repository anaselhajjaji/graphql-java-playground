package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

public record Author (String id, String firstName, String lastName) {

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joshua", "Bloch"),
            new Author("author-2", "Douglas", "Adams"),
            new Author("author-3", "Bill", "Bryson"),
            new Author("author-4", "Author 4 first name", "Author 4 last name"),
            new Author("author-5", "Author 5 first name", "Author 5 last name"),
            new Author("author-6", "Author 6 first name", "Author 6 last name"),
            new Author("author-7", "Author 7 first name", "Author 7 last name"),
            new Author("author-8", "Author 8 first name", "Author 8 last name"),
            new Author("author-9", "Author 9 first name", "Author 9 last name"),
            new Author("author-10", "Author 10 first name", "Author 10 last name")
    );

    public static Author getById(String id) {
        return authors.stream()
				.filter(author -> author.id().equals(id))
				.findFirst()
				.orElse(null);
    }
}