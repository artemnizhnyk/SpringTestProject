package com.artemnizhnyk.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
class SecurityAspect {
    @Before("com.artemnizhnyk.aop.aspects.MyPointcuts.allAddMethods()")
    void beforeAddSecurityAdvice(JoinPoint joinPoint) {
        System.out.println("beforeAddSecurityAdvice: checking for rights");
        System.out.println("--------------------------------------");
    }
}
