package com.example.demo.controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.BookConnection;
import com.example.demo.model.CursorInfo;

import java.util.List;

@Controller
public class BookController {
    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public BookConnection books(
            @Argument("first") Integer first,
            @Argument("after") String after,
            @Argument("last") Integer last,
            @Argument("before") String before) {
        return Book.getBookConnection(new CursorInfo(first, after, last, before));
    }

    @QueryMapping
    public List<Book> allBooks() {
        return Book.all();
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }
}