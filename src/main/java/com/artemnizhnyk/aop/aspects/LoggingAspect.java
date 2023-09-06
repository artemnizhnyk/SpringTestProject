package com.artemnizhnyk.aop.aspects;

import com.artemnizhnyk.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
@Aspect
@Order(1)
class LoggingAspect {
    @Before("com.artemnizhnyk.aop.aspects.MyPointcuts.allAddMethods()")
    void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature =" + methodSignature);
        System.out.println("methodSignature.getMethod =" + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType =" + methodSignature.getReturnType());
        System.out.println("methodSignature.getName =" + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments){
                if(obj instanceof Book myBook){
                    System.out.println("info about book: " + myBook + "\n" +
                            myBook.getName() + "\n" + myBook.getAuthor() + "\n" + myBook.getYearOfPublication());
                } else if (obj instanceof String person) {
                    System.out.println(person + " added a book/magazine to library");
                }
            }
        }



        System.out.println("beforeAddLoggingAdvice: logging of trying to add a book/magazine");
        System.out.println("--------------------------------------");
    }


//    @Pointcut("execution(* com.artemnizhnyk.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(void com.artemnizhnyk.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineMethodFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineMethodFromUniLibrary()")
//    private void allMethodsFromUniLibraryExceptReturnMagazine() {
//    }
//
//    @Before("allMethodsFromUniLibraryExceptReturnMagazine()")
//    void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: log #4");

//    }
//    @Pointcut("execution(* com.artemnizhnyk.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.artemnizhnyk.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");

//    }


//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: trying to return the book");
//    }
}
