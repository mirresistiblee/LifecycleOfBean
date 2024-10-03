package com.beanlifecycleexample.beanlifecycleexample;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanLifecycleExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BeanLifecycleExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = context.getBean(MyService.class);
        myService.performAction();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
