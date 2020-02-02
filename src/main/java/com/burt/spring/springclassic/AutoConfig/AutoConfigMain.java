package com.burt.spring.springclassic.AutoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoConfigMain {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        System.out.println("Hello");
    }
}
