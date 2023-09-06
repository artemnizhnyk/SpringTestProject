package com.artemnizhnyk.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
class University {
    private List<Student> students = new ArrayList<>();

    void addStudents(){
        Student st1 = new Student("Artem Nizhnyk", 4, 7.5);
        Student st2 = new Student("Daniel Matwiewski", 2, 8.3);
        Student st3 = new Student("Eugene Hachaturov", 3, 9.2);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    List<Student> getStudents(){
        System.out.println("Starts of working getStudents method");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }
}
