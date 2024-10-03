package com.beanlifecycleexample.beanlifecycleexample;


public class MyService {

    public MyService() {
        System.out.println("MyService bean is created.");
    }

    public void performAction() {
        System.out.println("Action performed by MyService.");
    }
}
