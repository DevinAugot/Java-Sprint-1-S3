package com.javaSprintOne;

import java.util.ArrayList;

public class Author {
    private String authorName;
    private String DOB;

    public String getAuthorBooks() {
        return authorBooks;
    }

    public void setAuthorBooks(String authorBooks) {
        this.authorBooks = authorBooks;
    }

    private String authorBooks;
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


    public ArrayList<String> getAuthorBookList() {
        return authorBookList;
    }

    public void setAuthorBookList(ArrayList<String> authorBookList) {
        this.authorBookList = authorBookList;
    }


    ArrayList<String> authorBookList = new ArrayList<>();

      public Author(String authorName, String DOB, String authorBooks){
            this.authorName = authorName;
            this.DOB = DOB;
            this.authorBooks = authorBooks ;

        }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", authorBooks='" + authorBooks + '\'' +
                '}';
    }

}

