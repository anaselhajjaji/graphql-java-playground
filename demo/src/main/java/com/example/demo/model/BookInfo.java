package com.example.demo.model;

public record BookInfo(String startCursor, String endCursor, Boolean hasNextPage, Boolean hasPreviousPage) {}