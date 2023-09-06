package com.artemnizhnyk.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    void allAddMethods(){}
}
