package com.artemnizhnyk.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.artemnizhnyk.spring_introduction")
class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
