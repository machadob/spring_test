package com.burt.spring.springclassic.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HerderImpl implements Herder {

    private Animal animal;
    private Animal a1;
    private Animal a2;

//    @Autowired
//
//    public HerderImpl( @Qualifier("myDog") Animal animal){
//        this.animal = animal;
//    }

    @Autowired
    @Qualifier("myDuck")
    public void setAnimal(Animal animal) {
        System.out.println("In setAnimal : " + animal);
        this.animal = animal;
    }

    @Autowired

    public void setAnimals(@Qualifier("myDuck") Animal a1, @Qualifier("myDog") Animal a2){
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public void getAnimal() {
        System.out.println("Number of legs caught : " + animal.numberOfLegs());
    }
}
