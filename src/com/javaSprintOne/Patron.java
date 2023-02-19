package com.javaSprintOne;

import java.util.ArrayList;
import java.util.Arrays;

public class Patron {
    private String firstLastName;
    private String address;
    private String phoneNum;


    public String getBookList() {
        return bookList;
    }

    public void setBookList(String bookList) {
        this.bookList = bookList;
    }

    private String bookList;

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

 /// Trying to get array to print properly instead of empty or default reference numbers
    ArrayList<String> patronList = new ArrayList<>();
    @Override
    public String toString(){
    return String.valueOf(patronList);
}



}
