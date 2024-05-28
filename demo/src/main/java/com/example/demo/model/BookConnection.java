package com.example.demo.model;

import java.util.List;

public record BookConnection(List<BookEdge> edges, BookInfo pageInfo) {}
