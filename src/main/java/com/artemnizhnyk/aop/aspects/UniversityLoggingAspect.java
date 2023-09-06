package com.artemnizhnyk.aop.aspects;

import com.artemnizhnyk.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
class UniversityLoggingAspect {
    @After("execution(* getStudents())")
    void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: we are logging normal ends of method or throwing of exception");
    }

//        @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//        void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//            System.out.println("afterThrowingGetStudentsLoggingAdvice: we are logging throwing of exception " + exception);
//        }

//    @Before("execution(* getStudents())")
//    void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: logging getting list of students before method getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    void AfterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        System.out.println("AfterReturningGetStudentsLoggingAdvice: logging getting list of students after method getStudents");
//    }
}
