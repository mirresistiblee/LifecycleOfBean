package com.beanlifecycleexample.beanlifecycleexample;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent bean is created.");
    }

    @PostConstruct
    public void init() {
        System.out.println("MyComponent bean is initialized.");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("MyComponent bean is about to be destroyed...");
    }
}

