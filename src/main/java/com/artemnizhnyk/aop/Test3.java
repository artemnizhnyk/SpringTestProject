package com.artemnizhnyk.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class Test3 {
    public static void main(String[] args) {
        System.out.println("Main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println(bookName + " was added to library");
        context.close();
        System.out.println("Main ends");
    }
}
