package com.burt.spring.springboot;

import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootMain {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}