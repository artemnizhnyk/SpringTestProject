package com.artemnizhnyk.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.artemnizhnyk.aop")
@EnableAspectJAutoProxy
class MyConfig {
}
