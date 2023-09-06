package com.artemnizhnyk.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
class Person {


    private final Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    Person(@Qualifier("cat") final Pet pet) {
//        System.out.println("Person: constructor");
//        this.pet = pet;
//    }

    Person(final Pet pet) {
        System.out.println("Person: constructor");
        this.pet = pet;
    }

    void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public void setAge(final int age) {
        this.age = age;
    }


    Pet getPet() {
        return pet;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

}
