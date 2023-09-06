package com.artemnizhnyk.aop;

import org.springframework.stereotype.Component;

@Component
class SchoolLibrary extends AbstractLibrary {


    void getBook() {
        System.out.println("We are getting a book from SchoolLibrary");
    }
}
