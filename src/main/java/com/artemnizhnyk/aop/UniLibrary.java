package com.artemnizhnyk.aop;

import org.springframework.stereotype.Component;

@Component
class UniLibrary extends AbstractLibrary {


    void getBook() {
        System.out.println("We are getting a book from UniLibrary");
        System.out.println("--------------------------------------");
    }

    void addBook(String personName, Book book) {
        System.out.println("We are adding the book to UniLibrary");
        System.out.println("--------------------------------------");
    }

    String returnBook() {
        System.out.println("We are returning the book to UniLibrary");
        return "Any book";

    }

    void getMagazine() {
        System.out.println("We are getting a magazine from UniLibrary");
        System.out.println("--------------------------------------");
    }

    void addMagazine() {
        System.out.println("We are adding the magazine to UniLibrary");
        System.out.println("--------------------------------------");
    }

    void returnMagazine() {
        System.out.println("We are returning the magazine to UniLibrary");
        System.out.println("--------------------------------------");
    }
}
