package com.javaSprintOne;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * This class is the engine of the program
 */

public class Library implements Borrowable{

private ArrayList<Book> booksList;
private ArrayList<Patron> patronList;
private ArrayList<Author> authorList;


public Library(){
    this.booksList = new ArrayList<>();
    this.patronList = new ArrayList<>();
    this.authorList = new ArrayList<>();
};
    @Override
    public void borrowBook(Book book,Patron patron) {
        if (book.getNumberOfCopies() < 1) {
            book.setType(StatusType.CHECKED_OUT);
            System.out.println("This book is currently checked out");
    } else{
            patron.addBorrowedBooks(book);
            book.setNumberOfCopies(book.getNumberOfCopies() - 1);
            System.out.println("Book successfully borrowed");
        }
    }

    @Override
    public void returnBook(Book book,Patron patron) {
    if(patron.getBorrowedbooks().contains(book)){
        patron.removeBorrowedBook(book);
        book.setNumberOfCopies(book.getNumberOfCopies() + 1);
        book.setType(StatusType.AVAILABLE);
        System.out.println("Book successfully returned");
    }
    else{
        System.out.println("Error patron does not have the book");
    }
    }
    public void addPatron(Patron patron){
        this.patronList.add(patron);
    }

    public void removePatron(Patron patron){
        this.patronList.remove(patron);
    }
public void addAuthor(Author author){
        this.authorList.add(author);
}
public void removeAuthor(Author author){
    this.authorList.remove(author);
}
    public void addBook(Book book){
        this.booksList.add(book);
    }
    public void removeBook(Book book){
        this.booksList.remove(book);
    }
    public ArrayList<Book> searchBooks(String searchParameter){
        ArrayList<Book> matchedBooks = new ArrayList<>();
        for (Book book : booksList) {
            if (book.getBookTitle().equals(searchParameter) ||      //  Multiline if statement to check
                    book.getBookAuthor().equals(searchParameter) ||   // if book matches search parameters
                    book.getISBN().equals(searchParameter)
            ){
                matchedBooks.add(book);     //  Add book to arrayList if it matches, so we can return it
            }
        }
        return matchedBooks;
    }



}