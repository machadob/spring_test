package com.burt.spring.springclassic.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AnimalConfig {

    @Bean("myDog")
    public Dog dog() {
        return new Dog();
    }

    @Bean("myDuck")
    public Duck duck() {
        return new Duck();
    }

    @Bean
    public HerderImpl herderImpl() {
        return new HerderImpl();
    }
}
