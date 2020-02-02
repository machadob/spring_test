package com.burt.spring.springclassic.autoConfig.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HerderImpl implements Herder {

    private Animal animal;

//    @Autowired
//
//    public HerderImpl( @Qualifier("myDog") Animal animal){
//        this.animal = animal;
//    }

    @Autowired
    @Qualifier("duck")
    public void setAnimal(Animal animal) {
        System.out.println("In setAnimal : " + animal);
        this.animal = animal;
    }

    @Override
    public void getAnimal() {
        System.out.println("Number of legs caught : " + animal.numberOfLegs());
    }
}
