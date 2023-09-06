package com.artemnizhnyk.spring_introduction;

import org.springframework.stereotype.Component;

//@Component
class Cat implements Pet{
    Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
