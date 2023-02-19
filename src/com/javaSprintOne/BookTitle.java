package com.javaSprintOne;

public class BookTitle {
    private final String title;
    private final Author author;
    private final int id;

    public BookTitle(String title, Author author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }
}