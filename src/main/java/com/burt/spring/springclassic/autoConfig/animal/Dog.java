package com.burt.spring.springclassic.autoConfig.animal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
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
