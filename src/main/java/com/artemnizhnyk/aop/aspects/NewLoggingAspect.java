package com.artemnizhnyk.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Aspect
class NewLoggingAspect {
    @Around("execution(String returnBook())")
    Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: book is being added ");
        Object targetMethodResult = null;
        try {
        targetMethodResult = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: logging of exception throwing " + e);
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice: book was added ");
        return targetMethodResult;
    }
}
