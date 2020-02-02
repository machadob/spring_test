package com.burt.spring.springclassic.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public String toString() {
        return "Cat{}";
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
}
