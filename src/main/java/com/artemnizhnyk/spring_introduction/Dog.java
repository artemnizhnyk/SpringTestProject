package com.artemnizhnyk.spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
class Dog implements Pet {
    //    private String name;
    Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

//    @PostConstruct
//    private void init() {
//        System.out.println("Class Dog: init method");
//    }

//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }

//    String getName() {
//        return name;
//    }

//    void setName(final String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
