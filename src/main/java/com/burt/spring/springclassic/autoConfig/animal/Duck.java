package com.burt.spring.springclassic.autoConfig.animal;

import org.springframework.stereotype.Component;

@Component("myDuck")
public class Duck implements Animal {
    @Override
    public String toString() {
        return "Duck{}";
    }

    @Override
    public int numberOfLegs() {
        return 2;
    }
}
