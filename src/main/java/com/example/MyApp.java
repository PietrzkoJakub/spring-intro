package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyNameMessageService.class, RandomTextMessageService.class);

        MyNameMessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        RandomTextMessageService messageService1 = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());
    }
}
