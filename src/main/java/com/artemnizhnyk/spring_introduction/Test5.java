package com.artemnizhnyk.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        System.out.println("pre get bean");
        Pet pet = context.getBean("myPet", Pet.class);
        System.out.println("after get bean");
        context.close();
        System.out.println("after context close");


    }
}
