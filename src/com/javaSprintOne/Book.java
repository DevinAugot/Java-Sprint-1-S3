package com.javaSprintOne;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class Book extends ArrayList<Book> implements Borrowable {


    private StatusType type;
    public String bookTitle;
    public String bookAuthor;

    // ISBN is book serial number
    public String ISBN;
    public String bookPublisher;
    public int numberOfCopies;


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    public Book(){
        // empty constructor
    }

// compile book constructor
    public Book(String bookTitle, Author authorName, String ISBN, String bookPublisher, int numberOfCopies){
        this.bookTitle = bookTitle;

        this.bookAuthor =  authorName.getAuthorName();; // need help
       this.ISBN = ISBN;
       this.bookPublisher = bookPublisher;
       this.numberOfCopies = numberOfCopies;

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }




    public StatusType getType() {
        return type;
    }

    public void setType(StatusType type) {
        this.type = type;
    }

    @Override
    public void borrowBook(Book book, Patron patron) {

    }

    @Override
    public void returnBook(Book book, Patron patron) {

    }


    /// attempting return and borrow methods

}
