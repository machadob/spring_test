package com.burt.spring.springclassic.javaConfig;

import org.springframework.stereotype.Component;

@Component ("myDog")
public class Dog implements Animal {

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
