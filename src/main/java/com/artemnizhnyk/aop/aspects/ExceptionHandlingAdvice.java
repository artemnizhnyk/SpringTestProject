package com.artemnizhnyk.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
class ExceptionHandlingAdvice {
    @Before("com.artemnizhnyk.aop.aspects.MyPointcuts.allAddMethods()")
    void beforeAddExceptionHandlingAdvice(JoinPoint joinPoint){
        System.out.println("beforeAddExceptionHandlingAdvice: we handling and checking exceptions while trying to add a book/magazine");
        System.out.println("--------------------------------------");
    }
}
