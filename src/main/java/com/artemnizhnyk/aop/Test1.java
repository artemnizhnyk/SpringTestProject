package com.artemnizhnyk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        uniLibrary.addBook();
//        uniLibrary.returnMagazine();
        uniLibrary.getBook();
        uniLibrary.addBook("Artem", book);
        uniLibrary.addMagazine();


        context.close();

    }
}
