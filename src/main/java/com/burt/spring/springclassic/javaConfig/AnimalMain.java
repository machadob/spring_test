package com.burt.spring.springclassic.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
        //HerderImpl herder = (HerderImpl)context.getBean("herderImpl");
//        System.out.println("Herder : " + herder);
        System.out.println("End");
    }
}
